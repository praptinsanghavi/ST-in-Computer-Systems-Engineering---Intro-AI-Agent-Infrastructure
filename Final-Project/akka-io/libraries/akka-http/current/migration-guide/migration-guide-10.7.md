---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:44Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-guide-10.7.x.html
title: Migration Guide to and within Akka HTTP 10.7.x • Akka HTTP
---

# Migration Guide to and within Akka HTTP 10.7.x • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Migration Guide to and within Akka HTTP 10\.7\.x

## General Notes

See the general [compatibility guidelines](../compatibility-guidelines.html).

Under these guidelines, minor version updates are supposed to be binary compatible and drop\-in replacements for former versions under the condition that user code only uses public, stable, non\-deprecated API.

If you find an unexpected incompatibility please let us know.

No configuration changes are needed for updating an application from Akka HTTP 10\.6\.x to 10\.7\.x.

## Akka repository

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

## Dependency updates

### Akka

Akka HTTP 10\.7\.x requires Akka version \>\= 2\.10\.0\.

### Jackson

The Jackson dependency has been updated to 2\.17\.2 in Akka HTTP 10\.7\.0\. That bump includes many fixes and changes to Jackson, but it should not introduce any incompatibility in serialized format.

### Remove dependency to scala\-java8\-compat

The transitive dependency on scala\-java8\-compat has been removed.

### Support for slf4j 1\.7\.x and logback 1\.2\.x removed

This is the first release that only supports slf4j 2\.0\.x and logback 1\.5\.x.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/compatibility-guidelines.html
- https://doc.akka.io/libraries/akka-http/current/migration-guide/index.html
- https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-guide-10.6.x.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-guide-10.7.x.html](https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-guide-10.7.x.html)*