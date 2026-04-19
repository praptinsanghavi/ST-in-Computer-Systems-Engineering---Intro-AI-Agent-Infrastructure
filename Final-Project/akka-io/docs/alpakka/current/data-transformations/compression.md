---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:19Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/data-transformations/compression.html
title: Compressing/decompressing • Alpakka Documentation
---

# Compressing/decompressing • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Compressing/decompressing

Akka Stream contains support for compressing and decompressing streams of [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") elements.

Use [`Compression`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html "akka.stream.javadsl.Compression")[`Compression`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Compression$.html "akka.stream.scaladsl.Compression") as described in the Akka Stream documentation:

[Akka documentation](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-cookbook.html#dealing-with-compressed-data-streams)

### ZIP

[Alpakka File](../file.html#zip-archive) supports creating flows in ZIP\-format.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/json.html
- https://doc.akka.io/docs/alpakka/current/file.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-cookbook.html

---
*Source: [https://doc.akka.io/docs/alpakka/current/data-transformations/compression.html](https://doc.akka.io/docs/alpakka/current/data-transformations/compression.html)*