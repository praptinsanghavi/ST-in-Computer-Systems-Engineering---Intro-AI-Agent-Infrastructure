---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/io-dns.html
title: DNS Extension • Akka core
---

# DNS Extension • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# DNS Extension

Warning
`async-dns` does not support:

- [Local hosts file](https://github.com/akka/akka-core/issues/25846) e.g. `/etc/hosts` on Unix systems
- The [nsswitch.conf](https://linux.die.net/man/5/nsswitch.conf) file (no plan to support)

Additionally, while search domains are supported through configuration, detection of the system configured [Search domains](https://github.com/akka/akka-core/issues/25825) is only supported on systems that provide this configuration through a `/etc/resolv.conf` file, i.e. it isn’t supported on Windows or OSX, and none of the environment variables that are usually supported on most \*nix OSes are supported.

Note
The `async-dns` API is marked as `ApiMayChange` as more information is expected to be added to the protocol.

Warning
The ability to plugin in a custom DNS implementation is expected to be removed in future versions of Akka. Users should pick one of the built in extensions.

Akka DNS is a pluggable way to interact with DNS. Implementations must implement `akka.io.DnsProvider` and provide a configuration block that specifies the implementation via `provider-object`.

DNS via Akka Discovery
[Akka Discovery](discovery/index.html) can be backed by the Akka DNS implementation and provides a more general API for service lookups which is not limited to domain name lookup.

To select which `DnsProvider` to use set `akka.io.dns.resolver` to the location of the configuration.

There are currently two implementations:

- `inet-address` \- Based on the JDK’s `InetAddress`. Using this will be subject to both the JVM’s DNS cache and its built in one.
- `async-dns` \- A native implemention of the DNS protocol that does not use any JDK classes or caches.

`inet-address` is the default implementation as it pre\-dates `async-dns`, `async-dns` will likely become the default in the next major release.

DNS lookups can be done via the `DNS` extension:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/io/dns/DnsCompileOnlyDocSpec.scala#L27-L28 "Go to snippet source")val initial: Option[Dns.Resolved] = Dns(system).cache.resolve("google.com")(system, actorRef)
val cached: Option[Dns.Resolved] = Dns(system).cache.cached("google.com")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/io/dns/DnsCompileOnlyDocTest.java#L25-L35 "Go to snippet source")Option<DnsProtocol.Resolved> initial =
    Dns.get(system)
        .cache()
        .resolve(
            new DnsProtocol.Resolve("google.com", DnsProtocol.ipRequestType()),
            system,
            actorRef);
Option<DnsProtocol.Resolved> cached =
    Dns.get(system)
        .cache()
        .cached(new DnsProtocol.Resolve("google.com", DnsProtocol.ipRequestType()));
```

Alternatively the `IO(Dns)` actor can be interacted with directly. However this exposes the different protocols of the DNS provider. `inet-adddress` uses `Dns.Resolve` and `Dns.Resolved` where as the `async-dns` uses `DnsProtocol.Resolve` and `DnsProtocol.Resolved`. The reason for the difference is `inet-address` predates `async-dns` and `async-dns` exposes additional information such as SRV records and it wasn’t possible to evolve the original API in a backward compatible way.

Inet\-Address API:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/io/dns/DnsCompileOnlyDocSpec.scala#L33 "Go to snippet source")val resolved: Future[Dns.Resolved] = (IO(Dns) ? Dns.Resolve("google.com")).mapTo[Dns.Resolved]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/io/dns/DnsCompileOnlyDocTest.java#L40-L45 "Go to snippet source")final ActorRef dnsManager = Dns.get(system).manager();
CompletionStage<Object> resolved =
    ask(
        dnsManager,
        new DnsProtocol.Resolve("google.com", DnsProtocol.ipRequestType()),
        timeout);
```

Async\-DNS API:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/io/dns/DnsCompileOnlyDocSpec.scala#L40-L41 "Go to snippet source")val resolved: Future[DnsProtocol.Resolved] =
  (IO(Dns) ? DnsProtocol.Resolve("google.com")).mapTo[DnsProtocol.Resolved]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/io/dns/DnsCompileOnlyDocTest.java#L52-L54 "Go to snippet source")final ActorRef dnsManager = Dns.get(system).manager();
CompletionStage<Object> resolved =
    ask(dnsManager, DnsProtocol.resolve("google.com"), timeout);
```

The Async DNS provider has the following advantages:

- No JVM DNS caching. It is expected that future versions will expose more caching related information.
- No blocking. `InetAddress` resolving is a blocking operation.
- Exposes `SRV`, `A` and `AAAA` records.

## SRV Records

To get DNS SRV records `akka.io.dns.resolver` must be set to `async-dns` and `DnsProtocol.Resolve`’s requestType must be set to `DnsProtocol.Srv` 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/io/dns/DnsCompileOnlyDocSpec.scala#L47-L48 "Go to snippet source")val resolved: Future[DnsProtocol.Resolved] =
  (IO(Dns) ? DnsProtocol.Resolve("your-service", Srv)).mapTo[DnsProtocol.Resolved]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/io/dns/DnsCompileOnlyDocTest.java#L60-L62 "Go to snippet source")final ActorRef dnsManager = Dns.get(system).manager();
CompletionStage<Object> resolved =
    ask(dnsManager, DnsProtocol.resolve("google.com", DnsProtocol.srvRequestType()), timeout);
```

The `DnsProtocol.Resolved` will contain `akka.io.dns.SRVRecord`s.

## Code Examples

### Example 1: DNS Extension

```scala
val initial: Option[Dns.Resolved] = Dns(system).cache.resolve("google.com")(system, actorRef)
val cached: Option[Dns.Resolved] = Dns(system).cache.cached("google.com")
```

### Example 2: DNS Extension

```java
Option<DnsProtocol.Resolved> initial =
    Dns.get(system)
        .cache()
        .resolve(
            new DnsProtocol.Resolve("google.com", DnsProtocol.ipRequestType()),
            system,
            actorRef);
Option<DnsProtocol.Resolved> cached =
    Dns.get(system)
        .cache()
        .cached(new DnsProtocol.Resolve("google.com", DnsProtocol.ipRequestType()));
```

### Example 3: DNS Extension

```scala
val resolved: Future[Dns.Resolved] = (IO(Dns) ? Dns.Resolve("google.com")).mapTo[Dns.Resolved]
```

### Example 4: DNS Extension

```java
final ActorRef dnsManager = Dns.get(system).manager();
CompletionStage<Object> resolved =
    ask(
        dnsManager,
        new DnsProtocol.Resolve("google.com", DnsProtocol.ipRequestType()),
        timeout);
```

### Example 5: DNS Extension

```scala
val resolved: Future[DnsProtocol.Resolved] =
  (IO(Dns) ? DnsProtocol.Resolve("google.com")).mapTo[DnsProtocol.Resolved]
```

### Example 6: DNS Extension

```java
final ActorRef dnsManager = Dns.get(system).manager();
CompletionStage<Object> resolved =
    ask(dnsManager, DnsProtocol.resolve("google.com"), timeout);
```

### Example 7: SRV Records

```scala
val resolved: Future[DnsProtocol.Resolved] =
  (IO(Dns) ? DnsProtocol.Resolve("your-service", Srv)).mapTo[DnsProtocol.Resolved]
```

### Example 8: SRV Records

```java
final ActorRef dnsManager = Dns.get(system).manager();
CompletionStage<Object> resolved =
    ask(dnsManager, DnsProtocol.resolve("google.com", DnsProtocol.srvRequestType()), timeout);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/discovery/index.html
- https://doc.akka.io/libraries/akka-core/current/index-utilities-classic.html
- https://doc.akka.io/libraries/akka-core/current/io-udp.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/io-dns.html](https://doc.akka.io/libraries/akka-core/current/io-dns.html)*