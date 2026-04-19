---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/project/release-notes.html
title: Release notes • Akka Insights
---

# Release notes • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Release notes

## Akka Insights 2\.22

Migration Guide: [Migration guide for Akka Insights 2\.22](migration.html)

This release of Akka Insights (Cinnamon) adds exclusive support for Akka 25\.10\.

Note
From Cinnamon 2\.18 onward, each Cinnamon release will only support a single Akka release.

See [Akka module versions for 25\.10](https://doc.akka.io/libraries/akka-dependencies/25.10/).

The following versions of Scala and Java are supported:

- Scala 2\.13 and 3\.3
- Java 11, 17, 21, and 25\.

### New features in Akka Insights 2\.22

- Java 25 support.
- Additional metrics for [Cluster Sharding instrumentation](../instrumentations/akka-cluster-sharding/akka-cluster-sharding.html) that requires akka\-core `2.10.17` or later.
- Option to use [non\-blocking UUID generation for MDC](../extensions/mdc.html#automatic-correlation-ids).

### Bug fixes in Akka Insights 2\.22

- Fix an issue where metrics for actor mailbox and stash sizes were not handled correctly when threshold events were enabled.

## Previous release notes

[Akka Insights 2\.21 release notes](https://doc.akka.io/libraries/akka-insights/2.21.x/project/release-notes.html)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-dependencies/25.10/
- https://doc.akka.io/libraries/akka-insights/2.21.x/project/release-notes.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/mdc.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-cluster-sharding/akka-cluster-sharding.html
- https://doc.akka.io/libraries/akka-insights/current/project/information.html
- https://doc.akka.io/libraries/akka-insights/current/project/migration.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/project/release-notes.html](https://doc.akka.io/libraries/akka-insights/current/project/release-notes.html)*