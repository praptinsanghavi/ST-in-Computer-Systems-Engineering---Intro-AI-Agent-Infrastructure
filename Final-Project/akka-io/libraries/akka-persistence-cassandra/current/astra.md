---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/astra.html
title: DataStax Astra • Akka Persistence Cassandra
---

# DataStax Astra • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# DataStax Astra

You can spin up a free Apache Cassandra cluster in the cloud using [DataStax Astra](https://www.datastax.com/products/datastax-astra). To use a Cassandra\-as\-a\-Service cluster as Akka persistence, specify your secure connect bundle and credentials in your configuration instead of the contact points:

```
datastax-java-driver {
  basic {
    session-keyspace = my_keyspace
    cloud {
      secure-connect-bundle = /path/to/secure-connect-database_name.zip
    }
  }
  advanced {
    auth-provider {
      class = PlainTextAuthProvider
      # CLIENT ID and SECRET from Application Token that can be generated
      # from Token Management in Astra console.
      username = <CLIENT ID> 
      password = <CLIENT SECRET>
    }
  }
}

```

## Code Examples

### Example 1: DataStax Astra

```text
datastax-java-driver {
  basic {
    session-keyspace = my_keyspace
    cloud {
      secure-connect-bundle = /path/to/secure-connect-database_name.zip
    }
  }
  advanced {
    auth-provider {
      class = PlainTextAuthProvider
      # CLIENT ID and SECRET from Application Token that can be generated
      # from Token Management in Astra console.
      username = <CLIENT ID> 
      password = <CLIENT SECRET>
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/cosmosdb.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/scylladb.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/astra.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/astra.html)*