---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/bootstrap/local-config.html
title: Local using config • Akka Management
---

# Local using config • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Local using config

[Configuration](https://doc.akka.io/libraries/akka-core/current/discovery/index.html#discovery-method-configuration) based discovery can be used to see the Cluster Bootstrap process run locally within an IDE or from the command line.

To use `config` service discovery set the following configuration:

- `akka.management.cluster.bootstrap.contact-point-discovery.discovery-method` to `config`
- `akka.discovery.config.services.[cluster-name]` to the endpoinds of the Akka nodes

For example:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/local/src/main/resources/application.conf#L25-L44 "Go to snippet source")akka.discovery {
  config.services = {
    local-cluster = {
      endpoints = [
        {
          host = "127.0.0.1"
          port = 8558
        },
        {
          host = "127.0.0.2"
          port = 8558
        },
        {
          host = "127.0.0.3"
          port = 8558
        }
      ]
    }
  }
}
```

This configuration will return three endpoints for a service called `local-cluster`.

Akka bootstrap is then configured to lookup `local-cluster` in the `config`:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/local/src/main/resources/application.conf#L59-L66 "Go to snippet source")akka.management {
  cluster.bootstrap {
    contact-point-discovery {
      service-name = "local-cluster"
      discovery-method = config
    }
  }
}
```

Three main methods can be run, only overriding the host so the ActorSystem’s can all bind to the same port:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/local/src/main/scala/akka/cluster/bootstrap/Main.scala#L14-L41 "Go to snippet source")object Node1 extends App {
  new Main(1)
}

object Node2 extends App {
  new Main(2)
}

object Node3 extends App {
  new Main(3)
}

class Main(nr: Int) {

  val config: Config = ConfigFactory.parseString(s"""
      akka.remote.artery.canonical.hostname = "127.0.0.$nr"
      akka.management.http.hostname = "127.0.0.$nr"
    """).withFallback(ConfigFactory.load())
  val system = ActorSystem("local-cluster", config)

  AkkaManagement(system).start()

  ClusterBootstrap(system).start()

  Cluster(system).registerOnMemberUp({
    system.log.info("Cluster is up!")
  })
}
```

The example uses three loopback addresses: `127.0.0.2-4`. On Mac you’ll need to set these up:

```
sudo ifconfig lo0 alias 127.0.0.2 up
sudo ifconfig lo0 alias 127.0.0.3 up
sudo ifconfig lo0 alias 127.0.0.4 up

```

On Linux this should not be required.

Run the three mains: `Node1`, `Node2` and `Node3` and they will form a cluster either in your IDE or from the command line:

```
sbt "integration-test-local/runMain akka.cluster.bootstrap.Node1"
sbt "integration-test-local/runMain akka.cluster.bootstrap.Node2"
sbt "integration-test-local/runMain akka.cluster.bootstrap.Node3"

```

The first time one of the Nodes will form a new cluster and the others will join. Any subsequent restarts then the node will discover a cluster already exists and join.

## Code Examples

### Example 1: Local using config

```conf
akka.discovery {
  config.services = {
    local-cluster = {
      endpoints = [
        {
          host = "127.0.0.1"
          port = 8558
        },
        {
          host = "127.0.0.2"
          port = 8558
        },
        {
          host = "127.0.0.3"
          port = 8558
        }
      ]
    }
  }
}
```

### Example 2: Local using config

```conf
akka.management {
  cluster.bootstrap {
    contact-point-discovery {
      service-name = "local-cluster"
      discovery-method = config
    }
  }
}
```

### Example 3: Local using config

```scala
object Node1 extends App {
  new Main(1)
}

object Node2 extends App {
  new Main(2)
}

object Node3 extends App {
  new Main(3)
}

class Main(nr: Int) {

  val config: Config = ConfigFactory.parseString(s"""
      akka.remote.artery.canonical.hostname = "127.0.0.$nr"
      akka.management.http.hostname = "127.0.0.$nr"
    """).withFallback(ConfigFactory.load())
  val system = ActorSystem("local-cluster", config)

  AkkaManagement(system).start()

  ClusterBootstrap(system).start()

  Cluster(system).registerOnMemberUp({
    system.log.info("Cluster is up!")
  })
}
```

### Example 4: Local using config

```text
sudo ifconfig lo0 alias 127.0.0.2 up
sudo ifconfig lo0 alias 127.0.0.3 up
sudo ifconfig lo0 alias 127.0.0.4 up
```

### Example 5: Local using config

```text
sbt "integration-test-local/runMain akka.cluster.bootstrap.Node1"
sbt "integration-test-local/runMain akka.cluster.bootstrap.Node2"
sbt "integration-test-local/runMain akka.cluster.bootstrap.Node3"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/discovery/index.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/troubleshooting.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/bootstrap/local-config.html](https://doc.akka.io/libraries/akka-management/current/bootstrap/local-config.html)*