---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html
title: akka.io.dns
---

# akka.io.dns

## Content

# Package akka.io.dns

- Interface Summary 
| Interface | Description |
| [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") |  |
| --- | --- |
- Class Summary 
| Class | Description |
| [AAAARecord](AAAARecord.html "class in akka.io.dns") |  |
| --- | --- |
| [AAAARecord$](AAAARecord$.html "class in akka.io.dns") | INTERNAL API |
| [ARecord](ARecord.html "class in akka.io.dns") |  |
| [ARecord$](ARecord$.html "class in akka.io.dns") | INTERNAL API |
| [CachePolicy](CachePolicy.html "class in akka.io.dns") |  |
| [CachePolicy.Forever$](CachePolicy.Forever$.html "class in akka.io.dns") |  |
| [CachePolicy.Never$](CachePolicy.Never$.html "class in akka.io.dns") |  |
| [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") |  |
| [CachePolicy.Ttl$](CachePolicy.Ttl$.html "class in akka.io.dns") |  |
| [CachePolicy.Ttl$.TtlIsOrdered$](CachePolicy.Ttl$.TtlIsOrdered$.html "class in akka.io.dns") |  |
| [CachePolicy$](CachePolicy$.html "class in akka.io.dns") |  |
| [CNameRecord](CNameRecord.html "class in akka.io.dns") |  |
| [CNameRecord$](CNameRecord$.html "class in akka.io.dns") |  |
| [DnsProtocol](DnsProtocol.html "class in akka.io.dns") | Supersedes [`Dns`](../Dns.html "class in akka.io") protocol. |
| [DnsProtocol.Ip](DnsProtocol.Ip.html "class in akka.io.dns") |  |
| [DnsProtocol.Ip$](DnsProtocol.Ip$.html "class in akka.io.dns") |  |
| [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns") | Sending this to the `AsyncDnsManager` will either lead to a [`DnsProtocol.Resolved`](DnsProtocol.Resolved.html "class in akka.io.dns") or a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor") response. |
| [DnsProtocol.Resolve$](DnsProtocol.Resolve$.html "class in akka.io.dns") |  |
| [DnsProtocol.Resolved](DnsProtocol.Resolved.html "class in akka.io.dns") | param: name of the record  param: records resource records for the query  param: additionalRecords records that relate to the query but are not strictly answers |
| [DnsProtocol.Resolved$](DnsProtocol.Resolved$.html "class in akka.io.dns") |  |
| [DnsProtocol.Srv$](DnsProtocol.Srv$.html "class in akka.io.dns") |  |
| [DnsProtocol$](DnsProtocol$.html "class in akka.io.dns") | Supersedes [`Dns`](../Dns.html "class in akka.io") protocol. |
| [DnsSettings$](DnsSettings$.html "class in akka.io.dns") |  |
| [RecordClass](RecordClass.html "class in akka.io.dns") |  |
| [RecordClass$](RecordClass$.html "class in akka.io.dns") |  |
| [RecordType](RecordType.html "class in akka.io.dns") | DNS Record Type |
| [RecordType$](RecordType$.html "class in akka.io.dns") |  |
| [ResourceRecord](ResourceRecord.html "class in akka.io.dns") | Not for user extension |
| [ResourceRecord$](ResourceRecord$.html "class in akka.io.dns") | INTERNAL API |
| [SRVRecord](SRVRecord.html "class in akka.io.dns") |  |
| [SRVRecord$](SRVRecord$.html "class in akka.io.dns") | INTERNAL API |
| [UnknownRecord](UnknownRecord.html "class in akka.io.dns") |  |
| [UnknownRecord$](UnknownRecord$.html "class in akka.io.dns") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/AAAARecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/AAAARecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CNameRecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CNameRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Forever$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Never$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Ip$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Ip.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.RequestType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolve$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolved$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Srv$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/RecordClass$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/RecordClass.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/RecordType$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/RecordType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html)*