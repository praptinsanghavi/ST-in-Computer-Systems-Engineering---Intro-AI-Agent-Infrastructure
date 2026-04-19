---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/security.html
title: Security Announcements • Akka HTTP
---

# Security Announcements • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Security Announcements

Note
Security announcements has moved to a shared page for all Akka projects and can now be found at [akka.io/security](https://akka.io/security) 

## Receiving Security Advisories

The best way to receive any and all security announcements is to subscribe to the [Akka security list](https://groups.google.com/forum/#!forum/akka-security).

The mailing list is very low traffic, and receives notifications only after security reports have been managed by the core team and fixes are publicly available.

## Reporting Vulnerabilities

We strongly encourage people to report such problems to our private security mailing list first, before disclosing them in a public forum.

Following best\-practice, we strongly encourage anyone to report potential security vulnerabilities to [security@akka.io](/cdn-cgi/l/email-protection#795f5a48484c421c5f5a4040425f5a014e4c425f5a014e4b425f5a014f40425f5a014e4d425f5a484b48425f5a014d49425f5a014f4842125f5a48494e425f5a014f48425f5a4d4f42105f5a48484842) before disclosing them in a public forum like the mailing list or as a Github issue.

Reports to this email address will be handled by our security team, who will work together with you to ensure that a fix can be provided without delay.

## Fixed Security Vulnerabilities

### Fixed in Akka HTTP 10\.2\.7

- [CVE\-2021\-42697: Stack overflow while parsing User\-Agent header with deeply nested comments](security/2021-CVE-2021-42697-stack-overflow-parsing-user-agent.html)

### Fixed in Akka HTTP 10\.2\.4 \& 10\.1\.14

- [Incorrect handling of Transfer\-Encoding header](security/2021-02-24-incorrect-handling-of-Transfer-Encoding-header.html)

### Fixed in Akka HTTP 10\.1\.5 \& 10\.0\.14

- [Denial of Service via unlimited decoding with decodeRequest directive (“zip bomb”)](security/2018-09-05-denial-of-service-via-decodeRequest.html)

### Fixed in Akka HTTP 10\.0\.6 \& 2\.4\.11\.2

- [Illegal Media Range in Accept Header Causes StackOverflowError Leading to Denial of Service](security/2017-05-03-illegal-media-range-in-accept-header-causes-stackoverflowerror.html)

### Fixed in Akka HTTP 10\.0\.2 \& 2\.4\.11\.1

- [Denial\-of\-Service by stream leak on unconsumed closed connections](security/2017-01-23-denial-of-service-via-leak-on-unconsumed-closed-connections.html)

### Fixed in Akka HTTP 2\.4\.11

- [Directory Traversal Vulnerability Announcement](security/2016-09-30-windows-directory-traversal.html)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-http/10.7/index.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2016-09-30-windows-directory-traversal.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2017-01-23-denial-of-service-via-leak-on-unconsumed-closed-connections.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2017-05-03-illegal-media-range-in-accept-header-causes-stackoverflowerror.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2018-09-05-denial-of-service-via-decodeRequest.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2021-02-24-incorrect-handling-of-Transfer-Encoding-header.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2021-CVE-2021-42697-stack-overflow-parsing-user-agent.html
- https://doc.akka.io/libraries/akka-http/10.7/security/2021.html

---
*Source: [https://doc.akka.io/libraries/akka-http/10.7/security.html](https://doc.akka.io/libraries/akka-http/10.7/security.html)*