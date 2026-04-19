---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/security/2017-01-23-denial-of-service-via-leak-on-unconsumed-closed-connections.html
title: Denial-of-Service by stream leak on unconsumed closed connections • Akka HTTP
---

# Denial-of-Service by stream leak on unconsumed closed connections • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Denial\-of\-Service by stream leak on unconsumed closed connections

## Date

23 January 2017

## Description of Vulnerability

For requests containing request bodies (including request methods which would normally include entities like GET requests), a mistake in completion handling of a connection could lead to memory leaking after the connection had been closed before the entity was consumed. This may eventually lead to a failure of the system due to being out of memory.

Please subscribe to the [akka\-security](https://groups.google.com/forum/#!forum/akka-security) mailing list to be notified promptly about future security issues.

## Severity

The [CVSS](https://en.wikipedia.org/wiki/CVSS) score of this vulnerability is 6\.4 (Medium), based on vector [AV:N/AC:L/Au:N/C:N/I:N/A:C/E:F/RL:OF/RC:C](https://nvd.nist.gov/vuln-metrics/cvss/v2-calculator?calculator&version=2.0&vector=%28AV:N/AC:L/Au:N/C:N/I:N/A:C/E:F/RL:OF/RC:C%29).

## Affected Versions

- (experimental) Akka HTTP `2.4.11` and prior,
- (stable) Akka HTTP `10.0.1` and prior.

## Fixed Versions

We have prepared patches for the affected versions, and have released the following versions which resolve the issue: 

- Akka HTTP `2.4.11.1` (Scala 2\.11\)
- Akka HTTP `10.0.2` (Scala 2\.11, 2\.12\)

The patched releases contain no other changes except the single patch that addresses the memory leak vulnerability. *Binary and source compatibility has been maintained so the upgrade procedure is as simple as changing the library dependency.*

## Additional Important Information

Note that Play and Lagom applications are not impacted by this vulnerability, regardless of whether they are using the Akka HTTP backend or the Netty backend.

If you have any questions or need any help, please contact [\[email protected]](/cdn-cgi/l/email-protection#63101613130c1117230f0a040b1701060d074d000c0e).

## Acknowledgements

We would like to thank Dmitry Kolesnikov \& Lari Hotari for their thorough investigation and bringing this issue to our attention.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-http/current/security/2016.html
- https://doc.akka.io/libraries/akka-http/current/security/2017-05-03-illegal-media-range-in-accept-header-causes-stackoverflowerror.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/security/2017-01-23-denial-of-service-via-leak-on-unconsumed-closed-connections.html](https://doc.akka.io/libraries/akka-http/current/security/2017-01-23-denial-of-service-via-leak-on-unconsumed-closed-connections.html)*