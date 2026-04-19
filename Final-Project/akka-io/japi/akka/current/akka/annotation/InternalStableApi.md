---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/annotation/InternalStableApi.html
title: InternalStableApi
---

# InternalStableApi

## Content

Package [akka.annotation](package-summary.html)
## Annotation Type InternalStableApi

- ---

```
@Documented
@Retention(CLASS)
@Target({METHOD,CONSTRUCTOR,FIELD,TYPE,PACKAGE})
public @interface InternalStableApi
```

Marks APIs that are considered internal to Akka and should not be accessed by user code but that
 are used across Akka project boundaries and therefore shouldn't be changed without considering
 possible usage outside of the Akka core modules.

 If a method/class annotated with this annotation is part of a public API and has the Scala
 `private[akka]` access restriction, which leads to a public method from Java, there should
 be a javadoc/scaladoc comment where the first line MUST include `INTERNAL API` in order to
 be easily identifiable from generated documentation. Additional information may be put on the
 same line as the INTERNAL API comment in order to clarify further.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/annotation/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/annotation/InternalStableApi.html](https://doc.akka.io/japi/akka/current/akka/annotation/InternalStableApi.html)*