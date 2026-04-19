---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/overview.html
title: Overview • Alpakka Documentation
---

# Overview • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

The [Alpakka project](https://doc.akka.io/libraries/alpakka/current/) is an open source initiative to implement stream\-aware and reactive integration pipelines for Java and Scala. It is built on top of [Akka Streams](https://doc.akka.io/libraries/akka-core/current/stream/index.html), and has been designed from the ground up to understand streaming natively and provide a DSL for reactive and stream\-oriented programming, with built\-in support for backpressure. Akka Streams is a [Reactive Streams](https://www.reactive-streams.org/) and JDK 9\+ [java.util.concurrent.Flow](https://docs.oracle.com/javase/10/docs/api/java/util/concurrent/Flow.html)\-compliant implementation and therefore [fully interoperable](https://doc.akka.io/libraries/akka-core/current/general/stream/stream-design.html#interoperation-with-other-reactive-streams-implementations) with other implementations.

If you’d like to know what integrations with Alpakka look like, have a look at our [self\-contained examples](examples/index.html) section.

There are a few blog posts and presentations about Alpakka out there, we’ve [collected some](other-docs/webinars-presentations-articles.html).

## Versions

The code in this documentation is compiled against:

- Alpakka 10\.0\.2 ([Github](https://github.com/akka/alpakka), [API docs](https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/index.html))
- Scala 2\.13 (all modules are available for Scala 2\.13\)
- Akka Streams 2\.10\.11\+ ([Reference](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html), [Github](https://github.com/akka/akka))
- Akka HTTP 10\.7\.3\+ ([Reference](https://doc.akka.io/libraries/akka-http/10.7/), [Github](https://github.com/akka/akka-http))

See [Alpakka versioning](other-docs/versioning.html) for more details.

Release notes are found at [Release Notes](release-notes/index.html).

If you want to try out a connector that has not yet been released, give [snapshots](other-docs/snapshots.html) a spin which are published after every merged PR.

## Contributing

Please feel free to contribute to Alpakka by reporting issues you identify, or by suggesting changes to the code. Please refer to our [contributing instructions](https://github.com/akka/alpakka/blob/main/CONTRIBUTING.md) and our [contributor advice](https://github.com/akka/alpakka/blob/main/contributor-advice.md) to learn how it can be done. The target structure for Alpakka connectors is illustrated by the [Reference connector](reference.html).

We want Akka and Alpakka to strive in a welcoming and open atmosphere and expect all contributors to respect our [code of conduct](https://akka.io/conduct).

[![alpakka](https://index.scala-lang.org/count.svg?q=topics:akka-streams&subject=akka-streams&style=flat-square)](https://index.scala-lang.org/search?q=topics:akka-streams) Feel free to tag your project with *akka\-streams* keyword in Scaladex for easier discoverability.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/index.html
- https://doc.akka.io/libraries/akka-core/current/general/stream/stream-design.html
- https://doc.akka.io/libraries/akka-core/current/stream/index.html
- https://doc.akka.io/libraries/akka-http/10.7/
- https://doc.akka.io/libraries/alpakka/current/
- https://doc.akka.io/libraries/alpakka/current/examples/index.html
- https://doc.akka.io/libraries/alpakka/current/external-components.html
- https://doc.akka.io/libraries/alpakka/current/index.html
- https://doc.akka.io/libraries/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current/other-docs/versioning.html
- https://doc.akka.io/libraries/alpakka/current/other-docs/webinars-presentations-articles.html
- https://doc.akka.io/libraries/alpakka/current/reference.html
- https://doc.akka.io/libraries/alpakka/current/release-notes/index.html

---
*Source: [https://doc.akka.io/libraries/alpakka/current/overview.html](https://doc.akka.io/libraries/alpakka/current/overview.html)*