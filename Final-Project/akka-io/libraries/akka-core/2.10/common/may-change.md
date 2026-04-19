---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/common/may-change.html
title: Modules marked May Change • Akka core
---

# Modules marked May Change • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Modules marked “May Change”

To be able to introduce new modules and APIs without freezing them the moment they are released because of our [binary compatibility guarantees](binary-compatibility-rules.html) we have introduced the term **may change**.

Concretely **may change** means that an API or module is in early access mode and that it:

- is not covered by Lightbend’s commercial support (unless specifically stated otherwise)
- is not guaranteed to be binary compatible in minor releases
- may have its API change in breaking ways in minor releases
- may be entirely dropped from Akka in a minor release

Complete modules can be marked as **may change**, which will be stated in the module’s description and in the docs.

Individual public APIs can be annotated with [`ApiMayChange`](https://doc.akka.io/japi/akka-core/2.10/akka/annotation/ApiMayChange.html "akka.annotation.ApiMayChange") to signal that it has less guarantees than the rest of the module it lives in. For example, when while introducing “new” Java 8 APIs into existing stable modules, these APIs may be marked with this annotation to signal that they are not frozen yet. Please use such methods and classes with care, however if you see such APIs that is the best point in time to try them out and provide feedback (e.g. using the pull request comments or issues) before they are frozen as fully stable API.

Best effort migration guides may be provided, but this is decided on a case\-by\-case basis for **may change** modules.

The purpose of this is to be able to release features early and make them easily available and improve based on feedback, or even discover that the module or API wasn’t useful.

These are the current complete modules marked as **may change**:

- [Multi Node Testing](../multi-node-testing.html)
- [Reliable Delivery](../typed/reliable-delivery.html)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/japi/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/ide.html
- https://doc.akka.io/libraries/akka-core/2.10/common/binary-compatibility-rules.html
- https://doc.akka.io/libraries/akka-core/2.10/multi-node-testing.html
- https://doc.akka.io/libraries/akka-core/2.10/project/downstream-upgrade-strategy.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/reliable-delivery.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/common/may-change.html](https://doc.akka.io/libraries/akka-core/2.10/common/may-change.html)*