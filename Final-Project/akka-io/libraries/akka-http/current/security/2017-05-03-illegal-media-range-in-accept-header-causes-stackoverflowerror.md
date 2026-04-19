---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:22Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/security/2017-05-03-illegal-media-range-in-accept-header-causes-stackoverflowerror.html
title: Illegal Media Range in Accept Header Causes StackOverflowError Leading to Denial
  of Service • Akka HTTP
---

# Illegal Media Range in Accept Header Causes StackOverflowError Leading to Denial of Service • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Illegal Media Range in Accept Header Causes StackOverflowError Leading to Denial of Service

## Date

3 May 2017

## Description of Vulnerability

Handling a request that carries an Accept header with an unsupported media range starting with a wildcard but having a specific subtype (e.g. `*/boom`) leads to a stack overflow during negotiation of the content type. Per default, stack overflows are treated as fatal errors, so that the JVM process will shut itself down immediately.

Please subscribe to the [akka\-security](https://groups.google.com/forum/#!forum/akka-security) mailing list to be notified promptly about future security issues.

## Severity

The CVSS score of this vulnerability is 7\.8 (High), based on vector [(AV:N/AC:L/Au:N/C:N/I:N/A:C)](https://nvd.nist.gov/vuln-metrics/cvss/v2-calculator?vector=%28AV:N/AC:L/Au:N/C:N/I:N/A:C%29).

## Impact

All Akka HTTP servers using the high\-level routing DSL are affected. The infinite recursion happens inside the `complete` directive which is used in every Akka HTTP application using the high\-level DSL.

A remote attacker that is able to send an HTTP request with such a malformed Accept header to an Akka HTTP application is able to cause a StackOverflowException and if the exception remains unhandled effectively shut down the server.

Applications written using only the low\-level API from akka\-http\-core but not the routing DSL are not affected.

## Affected versions

- akka\-http prior to `10.0.6` and `2.4.11.2`

Notably **not affected**:

- Play Framework (regardless of used server backend)
- Lagom Framework
- Low\-level akka\-http\-core APIs
- Spray

## Fixed versions

- akka\-http `10.0.6` (stable)
- akka\-http `2.4.11.2` (experimental) (please upgrade to the actively maintained `10.0.x` series though)

Please note that the `2.4.11.2` release contains no other changes except the single patch that addresses the vulnerability. *Binary and source compatibility has been maintained so the upgrade procedure is as simple as changing the library dependency.*

If you have any questions or need any help, please contact [\[email protected]](/cdn-cgi/l/email-protection#c8bbbdb8b8a7babc88a4a1afa0bcaaada6ace6aba7a5).

## Acknowledgements

We would like to thank Martins Rumkovskis for finding and reporting this vulnerability.

At the same time we would like to remind our users that security related issues should be reported using our [\[email protected]](/cdn-cgi/l/email-protection#3340565046415a474a73525858521d5a5c) alias, such that we can prevent a vulnerability from being exploited while we work on a workaround or fix.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-http/current/security/2017-01-23-denial-of-service-via-leak-on-unconsumed-closed-connections.html
- https://doc.akka.io/libraries/akka-http/current/security/2017.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/security/2017-05-03-illegal-media-range-in-accept-header-causes-stackoverflowerror.html](https://doc.akka.io/libraries/akka-http/current/security/2017-05-03-illegal-media-range-in-accept-header-causes-stackoverflowerror.html)*