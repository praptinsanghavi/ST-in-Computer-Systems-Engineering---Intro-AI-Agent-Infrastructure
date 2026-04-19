---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:22:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
title: PathDirectives • Akka HTTP
---

# PathDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# PathDirectives

## Overview of path directives

This is a tiny overview for some of the most common path directives:

- `rawPathPrefix(x)`: it matches x and leaves a suffix (if any) unmatched.
- `pathPrefix(x)`: is equivalent to `rawPathPrefix(Slash ~ x)``rawPathPrefix(slash().concat(segment(x)))`. It matches a leading slash followed by *x* and then leaves a suffix unmatched.
- `path(x)`: is equivalent to `rawPathPrefix(Slash ~ x ~ PathEnd)``rawPathPrefix(slash().concat(segment(x)).concat(pathEnd()))`. It matches a leading slash followed by *x* and then the end.
- `pathEnd`: is equivalent to just `rawPathPrefix(PathEnd)``rawPathPrefix(pathEnd())`. It is matched only when there is nothing left to match from the path. This directive should not be used at the root as the minimal path is the single slash.
- `pathSingleSlash`: is equivalent to `rawPathPrefix(Slash ~ PathEnd)``rawPathPrefix(slash().concat(pathEnd()))`. It matches when the remaining path is just a single slash.
- `pathEndOrSingleSlash`: is equivalent to `rawPathPrefix(PathEnd)``rawPathPrefix(pathEnd())` or `rawPathPrefix(Slash ~ PathEnd)``rawPathPrefix(slash().concat(pathEnd()))`. It matches either when there is no remaining path or is just a single slash.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterSeq.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html)*