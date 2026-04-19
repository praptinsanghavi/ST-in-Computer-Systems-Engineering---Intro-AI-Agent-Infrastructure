---
description: Upgrade strategy for downstream libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/project/downstream-upgrade-strategy.html
title: Downstream upgrade strategy • Akka core
---

# Downstream upgrade strategy • Akka core

> **Summary:** Upgrade strategy for downstream libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Downstream upgrade strategy

When a new Akka version is released, downstream projects (such as [Akka Management](https://doc.akka.io/libraries/akka-management/current/), [Akka HTTP](https://doc.akka.io/libraries/akka-http/current/) and [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/current/)) do not need to update immediately: because of our [binary compatibility](../common/binary-compatibility-rules.html) approach, applications can take advantage of the latest version of Akka without having to wait for intermediate libraries to update.

## Patch versions

When releasing a new patch version of Akka (e.g. 2\.5\.22\), we typically don’t immediately bump the Akka version in satellite projects.

The reason for this is this will make it more low\-friction for users to update those satellite projects: say their project is on Akka 2\.5\.22 and Akka Management 1\.0\.0, and we release Akka Management 1\.0\.1 (still built with Akka 2\.5\.22\) and Akka 2\.5\.23\. They can safely update to Akka Management 1\.0\.1 without also updating to Akka 2\.5\.23, or update to Akka 2\.5\.23 without updating to Akka Management 1\.0\.1\.

When there is reason for a satellite project to upgrade the Akka patch version, they are free to do so at any time.

## Minor versions

When releasing a new minor version of Akka (e.g. 2\.6\.0\), satellite projects are also usually not updated immediately, but as needed.

When a satellite project does update to a new minor version of Akka, it will also increase its own minor version. The previous stable branch will enter the usual end\-of\-support lifecycle for Lightbend customers, and only important bugfixes will be backported to the previous version and released.

For example, when Akka 2\.5\.0 was released, Akka HTTP 10\.0\.x continued to depend on Akka 2\.4\. When it was time to update Akka HTTP to Akka 2\.5, 10\.1\.0 was created, but 10\.0\.x was maintained for backward compatibility for a period of time according to Lightbend’s support policy.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/common/binary-compatibility-rules.html
- https://doc.akka.io/libraries/akka-core/2.10/common/may-change.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-http/current/
- https://doc.akka.io/libraries/akka-management/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/project/downstream-upgrade-strategy.html](https://doc.akka.io/libraries/akka-core/2.10/project/downstream-upgrade-strategy.html)*