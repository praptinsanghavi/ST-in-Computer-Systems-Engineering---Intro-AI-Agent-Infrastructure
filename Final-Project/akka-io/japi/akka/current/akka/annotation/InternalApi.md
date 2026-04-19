---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/annotation/InternalApi.html
title: InternalApi
---

# InternalApi

## Content

Package [akka.annotation](package-summary.html)
## Annotation Type InternalApi

- ---

```
@Documented
@Retention(CLASS)
@Target({METHOD,CONSTRUCTOR,FIELD,TYPE,PACKAGE})
public @interface InternalApi
```

Marks APIs that are considered internal to Akka and may change at any point in time without any
 warning.

 For example, this annotation should be used when the Scala `private[akka]` access
 restriction is used, as Java has no way of representing this package restricted access and such
 methods and classes are represented as `public` in byte\-code.

 

If a method/class annotated with this method has a javadoc/scaladoc comment, the first line
 MUST include `INTERNAL API` in order to be easily identifiable from generated
 documentation. Additional information may be put on the same line as the INTERNAL API comment in
 order to clarify further.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/annotation/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/annotation/InternalApi.html](https://doc.akka.io/japi/akka/current/akka/annotation/InternalApi.html)*