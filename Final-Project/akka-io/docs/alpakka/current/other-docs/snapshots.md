---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:16Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/other-docs/snapshots.html
title: Snapshots • Alpakka Documentation
---

# Snapshots • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Snapshots

Snapshots are published to <https://repo.akka.io/snapshots> repository after every successful build on main. Add the following to your project build definition to resolve Alpakka snapshots:

## Configure repository

Maven

```
<project>
...
    <repositories>
      <repositories>
        <repository>
          <id>akka-repository</id>
          <name>Akka library snapshot repository</name>
          <url>https://repo.akka.io/snapshots</url>
        </repository>
      </repositories>
    </repositories>
...
</project>

```

sbt

```
resolvers += "Akka library snapshot repository".at("https://repo.akka.io/snapshots")

```

Gradle

```
repositories {
  maven {
    url  "https://repo.akka.io/snapshots"
  }
}

```

## Documentation

The [snapshot documentation](https://doc.akka.io/libraries/alpakka/snapshot/) is updated with every snapshot build.

## Code Examples

### Example 1: Configure repository

```xml
<project>
...
    <repositories>
      <repositories>
        <repository>
          <id>akka-repository</id>
          <name>Akka library snapshot repository</name>
          <url>https://repo.akka.io/snapshots</url>
        </repository>
      </repositories>
    </repositories>
...
</project>
```

### Example 2: Configure repository

```scala
resolvers += "Akka library snapshot repository".at("https://repo.akka.io/snapshots")
```

### Example 3: Configure repository

```gradle
repositories {
  maven {
    url  "https://repo.akka.io/snapshots"
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/docs/alpakka/current/other-docs/versioning.html
- https://doc.akka.io/docs/alpakka/current/reference.html
- https://doc.akka.io/libraries/alpakka/snapshot/

---
*Source: [https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html](https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html)*