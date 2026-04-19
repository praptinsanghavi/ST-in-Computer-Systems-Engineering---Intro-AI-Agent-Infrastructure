---
description: Akka 2.10.17 - akka.io.dns
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/index.html
title: Akka 2.10.17 - akka.io.dns
---

# Akka 2.10.17 - akka.io.dns

> **Summary:** Akka 2.10.17 - akka.io.dns

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/io/index.html "Permalink")  package [io](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/io/dns/index.html "Permalink")  package dnsDefinition Classes[io](../index.html)
- [AAAARecord](AAAARecord.html)
- [ARecord](ARecord.html)
- [CNameRecord](CNameRecord.html)
- [CachePolicy](CachePolicy$.html)
- [DnsProtocol](DnsProtocol$.html "Supersedes akka.io.Dns protocol.")
- [DnsSettings](DnsSettings$.html)
- [RecordClass](RecordClass.html)
- [RecordType](RecordType.html "DNS Record Type")
- [ResourceRecord](ResourceRecord.html "Not for user extension")
- [SRVRecord](SRVRecord.html)
- [UnknownRecord](UnknownRecord.html)
p[akka](../../index.html).[io](../index.html)

# dns[**](../../../akka/io/dns/index.html "Permalink")

#### package dns

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/io/dns/AAAARecord.html "Permalink") final  case class [AAAARecord](AAAARecord.html)(name: String, ttl: [Ttl](CachePolicy$$Ttl.html), ip: [Inet6Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet6Address.html#java.net.Inet6Address)) extends [ResourceRecord](ResourceRecord.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/io/dns/ARecord.html "Permalink") final  case class [ARecord](ARecord.html)(name: String, ttl: [Ttl](CachePolicy$$Ttl.html), ip: [InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)) extends [ResourceRecord](ResourceRecord.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../akka/io/dns/CNameRecord.html "Permalink") final  case class [CNameRecord](CNameRecord.html)(name: String, ttl: [Ttl](CachePolicy$$Ttl.html), canonicalName: String) extends [ResourceRecord](ResourceRecord.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/io/dns/RecordClass.html "Permalink") final  case class [RecordClass](RecordClass.html)(code: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short), name: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../akka/io/dns/RecordType.html "Permalink") final  case class [RecordType](RecordType.html "DNS Record Type")(code: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short), name: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDNS Record Type
6. [**](../../../akka/io/dns/ResourceRecord.html "Permalink") sealed abstract  class [ResourceRecord](ResourceRecord.html "Not for user extension") extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
7. [**](../../../akka/io/dns/SRVRecord.html "Permalink") final  case class [SRVRecord](SRVRecord.html)(name: String, ttl: [Ttl](CachePolicy$$Ttl.html), priority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), weight: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), target: String) extends [ResourceRecord](ResourceRecord.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
8. [**](../../../akka/io/dns/UnknownRecord.html "Permalink") final  case class [UnknownRecord](UnknownRecord.html)(name: String, ttl: [Ttl](CachePolicy$$Ttl.html), recType: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short), recClass: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short), data: [ByteString](../../util/ByteString.html)) extends [ResourceRecord](ResourceRecord.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/io/dns/CachePolicy$.html "Permalink")  object [CachePolicy](CachePolicy$.html)
2. [**](../../../akka/io/dns/DnsProtocol$.html "Permalink")  object [DnsProtocol](DnsProtocol$.html "Supersedes akka.io.Dns protocol.")Supersedes [akka.io.Dns](../Dns.html) protocol.

Supersedes [akka.io.Dns](../Dns.html) protocol.

Note that one MUST configure `akka.io.dns.resolver = async-dns` to make use of this protocol and resolver.

Allows for more detailed lookups, by specifying which records should be checked,
and responses can more information than plain IP addresses (e.g. ports for SRV records).
3. [**](../../../akka/io/dns/DnsSettings$.html "Permalink")  object [DnsSettings](DnsSettings$.html)
4. [**](../../../akka/io/dns/RecordClass$.html "Permalink")  object [RecordClass](RecordClass$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../../akka/io/dns/RecordType$.html "Permalink")  object [RecordType](RecordType$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/AAAARecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/ARecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CNameRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$$Ttl.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordClass$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordClass.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordType$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordType.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/SRVRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/UnknownRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html](https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html)*