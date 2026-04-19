---
description: Snapshot builds via the Sonatype snapshot repository.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-jdbc/current/snapshots.html
title: Snapshots • Akka Persistence JDBC
---

# Snapshots • Akka Persistence JDBC

> **Summary:** Snapshot builds via the Sonatype snapshot repository.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Snapshots

Snapshots are published to <https://repo.akka.io/snapshots> repository after every successful build on master. Add the following to your project build definition to resolve Akka Persistence JDBC’s snapshots:

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

The [snapshot documentation](https://doc.akka.io/libraries/akka-persistence-jdbc/snapshot) is updated with every snapshot build.

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
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/custom-dao.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/snapshot

---
*Source: [https://doc.akka.io/libraries/akka-persistence-jdbc/current/snapshots.html](https://doc.akka.io/libraries/akka-persistence-jdbc/current/snapshots.html)*