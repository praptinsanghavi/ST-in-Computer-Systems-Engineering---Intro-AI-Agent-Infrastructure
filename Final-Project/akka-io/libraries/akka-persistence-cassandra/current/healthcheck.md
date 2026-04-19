---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/healthcheck.html
title: Health check • Akka Persistence Cassandra
---

# Health check • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Health check

A [health check for Akka Management](https://doc.akka.io/libraries/akka-management/current/healthchecks.html) is provided. To enable it you need to add the following configuration

```
akka.management {
  health-checks {
    readiness-checks {
      akka-persistence-cassandra = "akka.persistence.cassandra.healthcheck.CassandraHealthCheck"
    }
  }
}

```

By default it will try to query the `system.local` table. The query can be configured with:

```
akka.persistence.cassandra.healthcheck {
  health-check-cql = "SELECT now() FROM system.local"
}

```

## Code Examples

### Example 1: Health check

```text
akka.management {
  health-checks {
    readiness-checks {
      akka-persistence-cassandra = "akka.persistence.cassandra.healthcheck.CassandraHealthCheck"
    }
  }
}
```

### Example 2: Health check

```text
akka.persistence.cassandra.healthcheck {
  health-check-cql = "SELECT now() FROM system.local"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-management/current/healthchecks.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/configuration.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/cqrs.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/healthcheck.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/healthcheck.html)*