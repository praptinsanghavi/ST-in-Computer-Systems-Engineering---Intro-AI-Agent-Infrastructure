---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/annotation/DoNotInherit.html
title: DoNotInherit
---

# DoNotInherit

## Content

Package [akka.annotation](package-summary.html)
## Annotation Type DoNotInherit

- ---

```
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface DoNotInherit
```

Marks APIs that are designed under a closed\-world assumption for and are NOT meant to be extended
 by user\-code. It is fine to extend these classes within Akka itself, however.

 This is most useful for binary compatibility purposes when a set of classes and interfaces
 assume a "closed world" between them, and gain the ability to add methods to the interfaces
 without breaking binary compatibility for users of this code. Specifically this assumption may be
 understood intuitively: as all classes that implement this interface are in this compilation unit
 / artifact, it is impossible to obtain an "old" class with a "new" interface, as they are part of
 the same dependency.

 

Notable examples of such API include the FlowOps trait in Akka Streams or Akka HTTP model
 interfaces, which extensively uses inheritance internally, but are not meant for extension by
 user code.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/annotation/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/annotation/DoNotInherit.html](https://doc.akka.io/japi/akka-core/2.10/akka/annotation/DoNotInherit.html)*