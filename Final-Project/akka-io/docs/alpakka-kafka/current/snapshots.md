---
description: Snapshot builds of Alpakka Kafka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:32Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/snapshots.html
title: Snapshots • Alpakka Kafka Documentation
---

# Snapshots • Alpakka Kafka Documentation

> **Summary:** Snapshot builds of Alpakka Kafka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Snapshots

Snapshots are published to <https://repo.akka.io/snapshots> repository after every successful build on main. Add the following to your project build definition to resolve Alpakka Kafka connector snapshots:

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

The [snapshot documentation](https://doc.akka.io/libraries/alpakka-kafka/snapshot/) is updated with every snapshot build.

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
- https://doc.akka.io/docs/alpakka-kafka/current/production.html
- https://doc.akka.io/libraries/alpakka-kafka/snapshot/

---
*Source: [https://doc.akka.io/docs/alpakka-kafka/current/snapshots.html](https://doc.akka.io/docs/alpakka-kafka/current/snapshots.html)*