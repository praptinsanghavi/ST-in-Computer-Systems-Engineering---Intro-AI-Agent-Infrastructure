---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/contributing.html
title: 10. Contributing • Akka HTTP
---

# 10. Contributing • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# 10\. Contributing

## Welcome!

We follow the standard GitHub [fork \& pull](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests#fork--pull) approach to pull requests. Just fork the official repo, develop in a branch, and submit a PR!

For a more detailed description of our process, please refer to the [CONTRIBUTING.md](https://github.com/akka/akka-http/blob/main/CONTRIBUTING.md) page on the github project.

## Build Token

To build locally, you need to fetch a token at <https://account.akka.io/token> that you have to place into `~/.sbt/1.0/akka-commercial.sbt` file like this:

```
ThisBuild / resolvers += "lightbend-akka".at("your token resolver here")

```

## Snapshots

Testing snapshot versions can help us find bugs before a release. We publish snapshot versions for every commit to the `main` branch.

Snapshot builds are available at YOUR\_TOKEN\_RESOLVER/snapshots. All Akka modules that belong to the same build have the same version.

### Configure repository

sbt

```
resolvers += "Akka library snapshot repository".at("YOUR_TOKEN_RESOLVER/snapshots")

```

Maven

```
<project>
...
  <repositories>
    <repositories>
      <repository>
        <id>akka-repository</id>
        <name>Akka library snapshot repository</name>
        <url>YOUR_TOKEN_RESOLVER/snapshots</url>
      </repository>
    </repositories>
  </repositories>
...
</project>

```

Gradle

```
repositories {
  maven {
    url  "YOUR_TOKEN_RESOLVER/snapshots"
  }
}

```

## Code Examples

### Example 1: Build Token

```text
ThisBuild / resolvers += "lightbend-akka".at("your token resolver here")
```

### Example 2: Configure repository

```scala
resolvers += "Akka library snapshot repository".at("YOUR_TOKEN_RESOLVER/snapshots")
```

### Example 3: Configure repository

```xml
<project>
...
  <repositories>
    <repositories>
      <repository>
        <id>akka-repository</id>
        <name>Akka library snapshot repository</name>
        <url>YOUR_TOKEN_RESOLVER/snapshots</url>
      </repository>
    </repositories>
  </repositories>
...
</project>
```

### Example 4: Configure repository

```gradle
repositories {
  maven {
    url  "YOUR_TOKEN_RESOLVER/snapshots"
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/native-image.html
- https://doc.akka.io/libraries/akka-http/current/reference.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/contributing.html](https://doc.akka.io/libraries/akka-http/current/contributing.html)*