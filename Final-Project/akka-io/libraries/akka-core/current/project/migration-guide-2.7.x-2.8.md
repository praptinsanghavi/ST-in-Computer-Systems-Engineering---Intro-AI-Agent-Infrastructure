---
description: Migrating to Akka 2.8.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/project/migration-guide-2.7.x-2.8.x.html
title: Migration Guide 2.7.x to 2.8.x • Akka core
---

# Migration Guide 2.7.x to 2.8.x • Akka core

> **Summary:** Migrating to Akka 2.8.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Migration Guide 2\.7\.x to 2\.8\.x

Akka 2\.8\.x is binary backwards compatible with 2\.7\.x with the ordinary exceptions listed in the [Binary Compatibility Rules](../common/binary-compatibility-rules.html).

No configuration changes are needed for updating an application from Akka 2\.7\.x to 2\.8\.x.

Rolling updates of Akka Cluster from Akka 2\.7\.x to 2\.8\.x is fully supported.

A few deprecated features and OSGi has been removed in Akka 2\.8\.x, see sections below.

## OSGi no longer supported out of the box

OSGi packaging and support in Akka has been dropped.

Projects using OSGi will need to re\-package or find another solution for using OSGi, you can find some possible hints in issue: [https://github.com/akka/akka\-core/issues/28304](https://github.com/akka/akka-core/issues/28304)

## Deprecated Classic Remoting has been removed.

Classic Remoting transport has been deprecated since Akka 2\.6\.0 (2019\-11\-06\) and is replaced by the Artery transport, which has been the default since 2\.6\.0 and declared ready for production in Akka 2\.5\.22 (2019\-04\-03\).

See [migration guide for Akka 2\.6\.x](https://doc.akka.io/libraries/akka-core/2.6/project/migration-guide-2.5.x-2.6.x.html#default-remoting-is-now-artery-tcp) and [What is new in Artery](https://doc.akka.io/libraries/akka-core/2.6/remoting-artery.html#what-is-new-in-artery).

### Moved classes for Multi JVM TestKit

When using the [Multi JVM TestKit](../multi-jvm-testing.html) you need to change the imports for `Direction` and `ThrottleMode` classes.

```
akka.remote.transport.ThrottlerTransportAdapter.*

```

was moved to:

```
akka.remote.testkit.*

```

## Code Examples

### Example 1: Moved classes for Multi JVM TestKit

```text
akka.remote.transport.ThrottlerTransportAdapter.*
```

### Example 2: Moved classes for Multi JVM TestKit

```text
akka.remote.testkit.*
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.6/project/migration-guide-2.5.x-2.6.x.html
- https://doc.akka.io/libraries/akka-core/2.6/remoting-artery.html
- https://doc.akka.io/libraries/akka-core/current/common/binary-compatibility-rules.html
- https://doc.akka.io/libraries/akka-core/current/multi-jvm-testing.html
- https://doc.akka.io/libraries/akka-core/current/project/migration-guide-2.6.x-2.7.x.html
- https://doc.akka.io/libraries/akka-core/current/project/migration-guide-2.8.x-2.9.x.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/project/migration-guide-2.7.x-2.8.x.html](https://doc.akka.io/libraries/akka-core/current/project/migration-guide-2.7.x-2.8.x.html)*