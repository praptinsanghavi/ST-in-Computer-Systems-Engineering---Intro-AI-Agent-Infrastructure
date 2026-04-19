---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/scylladb.html
title: ScyllaDB • Akka Persistence Cassandra
---

# ScyllaDB • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ScyllaDB

Warning
**This project is not continuously tested against ScyllaDB, and ScyllaDB is not supported as part of the [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription).**

[ScyllaDB](https://www.scylladb.com) is a wire compatible replacement for Cassandra. Initial testing shows that there are issues when using ScyllaDB with persistent query which is also used for recovery.

Users with ScyllaDB experience and test environments are very welcome contributors! You can run the tests and having a ScyllaDB instance accessible on localhost port 9042, or adjust the `datastax-java-driver.basic.contact-points` and other configuration to connect to your ScyllaDB.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/astra.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/migrations.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/scylladb.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/scylladb.html)*