---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/instrumentations/akka/ask-pattern.html
title: Ask Pattern configuration • Akka Insights
---

# Ask Pattern configuration • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Ask Pattern configuration

Availability
Available since Cinnamon **2\.14\.0**

Note
Akka [`Actor Selection`](https://doc.akka.io/libraries/akka-core/current/actors.html#identifying-actors-via-actor-selection) is not supported for `ask-pattern` metrics.

Ask\-pattern metrics can be collected for simple actors both Classic and Typed, sharded entities, or persistent entities. For that actors or entities need to be selected for telemetry.

## Regular actors configuration

Any of the existing [actor selections](actors.html#actor-selection) can be used to apply ask\-pattern settings to the specific actors and entities.

```
cinnamon.akka {
  ask-pattern.actors {
    "/user/a/*" {
      report-by = class
    }
  }
}
```

## Akka Sharding entity configuration

The communication with sharded entities usually happens via sharding region actors. There is one sharding region actor per entity type. The next config will enable collecting ask\-pattern metrics for per each sharded entity region:

```
cinnamon.akka {
  ask-pattern.actors {
    "akka.cluster.sharding.ShardRegion" {
      report-by = instance
    }
  }
}
```
Note
The `akka.cluster.sharding.ShardRegion` class selector is essential here because the `"/system/sharding/*"` selector will select not only a sharding region but every actor residing by this path including entity, shard, and shard coordinator actors.

Also, the next config can be used to select one specific sharded entity region:

```
cinnamon.akka {
  ask-pattern.actors {
    "/system/sharding/EntityFooName" {
      report-by = instance
    }
  }
}
```

## Capturing Source location

Ask Pattern instrumentation provides opt\-in configuration to enable capturing `ask` source\-location for failure and timeout events. It can be useful to track where the failed or timed out request originated in the source code. This isn’t enabled by default because it requires stack trace capturing on each ask call that can add some undesirable overhead. In order to enable it, use the next configuration:

```
cinnamon.akka {
  ask-pattern.actors {
    "/system/sharding/EntityFooName" {
      report-by = instance
      source-location = on
    }
  }
}
```

This is a sample of the [Slf4jEvents](../../plugins/slf4jevents/slf4j-events.html) output when `source-location` is enabled.

```
WARN  CinnamonSlf4jEvents - {actor=FlakyActor, actor-ref=Actor[akka://system/user/$a#-202322272], actor-system=system, cause=java.lang.RuntimeException: test, event-type=Failed request event, message=Bar(bar+85), source-location=AskPatternSampleApp.scala:133}
WARN  CinnamonSlf4jEvents - {actor=FlakyActor, actor-ref=Actor[akka://system/user/$a#-202322272], actor-system=system, event-type=Expired request event, message=Bar(bar+76), source-location=AskPatternSampleApp.scala:133, timeout=500 milliseconds}

```

It includes the `source-location=AskPatternSampleApp.scala:133` source location in the produced events.

## Dimensions

### Message type dimensions

Opt\-in message type dimensions are available that enable collecting metrics by message type. By default, these dimensions are off but can be enabled for each selection separately:

```
cinnamon.akka {
  ask-pattern.actors {
    "/system/sharding/EntityFooName" {
      report-by = instance
      message-type = on
    }
  }
}
```

## Code Examples

### Example 1: Regular actors configuration

```scala
cinnamon.akka {
  ask-pattern.actors {
    "/user/a/*" {
      report-by = class
    }
  }
}
```

### Example 2: Akka Sharding entity configuration

```scala
cinnamon.akka {
  ask-pattern.actors {
    "akka.cluster.sharding.ShardRegion" {
      report-by = instance
    }
  }
}
```

### Example 3: Akka Sharding entity configuration

```scala
cinnamon.akka {
  ask-pattern.actors {
    "/system/sharding/EntityFooName" {
      report-by = instance
    }
  }
}
```

### Example 4: Capturing Source location

```scala
cinnamon.akka {
  ask-pattern.actors {
    "/system/sharding/EntityFooName" {
      report-by = instance
      source-location = on
    }
  }
}
```

### Example 5: Capturing Source location

```text
WARN  CinnamonSlf4jEvents - {actor=FlakyActor, actor-ref=Actor[akka://system/user/$a#-202322272], actor-system=system, cause=java.lang.RuntimeException: test, event-type=Failed request event, message=Bar(bar+85), source-location=AskPatternSampleApp.scala:133}
WARN  CinnamonSlf4jEvents - {actor=FlakyActor, actor-ref=Actor[akka://system/user/$a#-202322272], actor-system=system, event-type=Expired request event, message=Bar(bar+76), source-location=AskPatternSampleApp.scala:133, timeout=500 milliseconds}
```

### Example 6: Message type dimensions

```scala
cinnamon.akka {
  ask-pattern.actors {
    "/system/sharding/EntityFooName" {
      report-by = instance
      message-type = on
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-cluster-sharding/akka-cluster-sharding.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/actors-typed.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/actors.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/slf4jevents/slf4j-events.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/ask-pattern.html](https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/ask-pattern.html)*