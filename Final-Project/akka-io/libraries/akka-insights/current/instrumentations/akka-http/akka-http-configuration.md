---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/instrumentations/akka-http/akka-http-configuration.html
title: Akka HTTP configuration • Akka Insights
---

# Akka HTTP configuration • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka HTTP configuration

Akka HTTP endpoints need to be selected for Akka Insights (Cinnamon) using configuration. Cinnamon accesses the same configuration as used to configure an `ActorSystem`. The default configuration is in `application.conf`.

## Server metrics

[Server metrics](akka-http.html#akka-http-server-metrics) are automatically enabled when Cinnamon’s Akka HTTP dependency is on the classpath.

It is possible to turn server\-metrics off for a server with configuration, see [override and disable server metrics](akka-http-configuration.html#override-and-disable-server-metrics) below.

## Server metrics configuration

[Endpoint metrics](akka-http.html#akka-http-server-endpoint-metrics) are *not* enabled by default. In other words, without any specific configuration, there will be no metrics for the endpoints.

Endpoint configuration settings are grouped per “host:port.” An actor system can run several Akka HTTP servers and when a server is started, Cinnamon will inquire the configuration to determine how to set things up.

The configuration should define the following settings:

| Setting | Explanation |
| --- | --- |
| host:port | The IP address and port the setting is valid for. Can be set to `"*:*"` to be valid for all hosts/ports. |
| server\-metrics | An *optional* setting (by default set to `on`) that can be used to turn metrics off for server(s). |
| paths | A section in which endpoint paths are defined with specific settings per endpoint. |

Each endpoint in the `paths` section should define the following:

| Setting | Explanation |
| --- | --- |
| endpoint path | The endpoint path to configure. A `*` wildcard can be used at the **end** to select all subpaths. |
| metrics | Should be set to `on`, `true` or `yes` for metrics to be created. |
| status\-code\-classes | Should be set to `on`, `true` or `yes` for endpoint metrics per status code class to be created. |
| status\-codes | Should be set to `on`, `true` or `yes` for metrics per granular status codes to be created. |

#### Endpoint naming

By default, endpoint metrics created use the endpoint path as name for the metric. Let’s look at a couple of examples to clarify this feature:

| Path directive | Metric name |
| --- | --- |
| path(“customers”) | `customers` |
| path(“customers” / IntNumber) | `customers/<Integer>` |
| path(“customers” / IntNumber / “addresses” / LongNumber) | `customers/<Integer>/addresses/<Integer>` |
| path(“accounts/type”) | `accounts/type` |
| path(“accounts” / Segment) | `accounts/<String>` |

It is also possible to [set the name](akka-http-api.html#server-endpoint-naming) programmatically.

## Example configurations

### Simple server configuration

The simplest configuration possible is the one that matches all paths, hosts and ports:

```
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "*" {
        metrics = on
      }
    }
  }
}
```

### Configure specific endpoint paths

Below is an example configuration that is more specific than the [simple server configuration](akka-http-configuration.html#simple-server-configuration):

```
cinnamon.akka.http.servers {
  "192.168.10.1:8080" {
    paths {
      "users/us/*" {
        metrics = on
      }
      "users/se/*" {
        metrics = on
      }
      "users/nz/*" {
        metrics = on
      }
    }
  }
}
```

The above configuration will create metrics for paths that map to `users` in `us`, `se`, or `nz`. Notice that all users in these domains are valid since we use `*` as part of the paths. Furthermore, this configuration is only valid for a server started on IP `192.168.10.1` and port `8080`.

### Override and disable server metrics

HTTP server configuration is selected from most specific to least specific port and host combination. This means that you can override wildcard configurations by having a more specific configuration section that have different settings.

Turn off all metrics for a particular host while still having them turned on for all other hosts:

```
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "*" {
        metrics = on
      }
    }
  },
  "192.168.0.1:*" {
    server-metrics = off
  }
}
```

The `server-metrics` setting is optional and if not present it will automatically be set to `on`.

### Enable endpoint metrics per status code class

Availability
Available since Cinnamon **2\.13\.0**

Like overall server metrics, endpoint metrics (response rate and response time) can be recorded for each status code class (2xx, 3xx, 4xx, or 5xx). Use the `status-code-classes` setting to enable these additional metrics for matching endpoint paths:

```
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "a/*" {
        metrics = on
      }
      "b/*" {
        metrics = on
        status-code-classes = on
      }
    }
  }
}
```

### Enable endpoint metrics per status code

To get even more insights, endpoint metrics (response rate and response time) can be recorded for each response status code. Use the `status-codes` setting to enable these additional metrics for matching endpoint paths: 

```
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "a/*" {
        metrics = on
      }
      "b/*" {
        metrics = on
        status-codes = on
      }
    }
  }
}
```

## Client metrics configuration

[Client metrics](akka-http.html#akka-http-client-metrics) configuration settings are grouped per “host:port”. In the context of Akka HTTP client we refer to “host:port” as a service. Each service can define which “paths” should generate metrics.

The name used for the metric will be the first available in order out of [programmatic `Request.withName`](akka-http-api.html#client-request-naming), configured `service-name`, otherwise `host:port`.

Let us look at a couple of client metrics configuration examples.

### Simple client configuration

The simplest configuration possible is the one that matches all paths, hosts and ports:

```
cinnamon.akka.http.clients {
  "*:*" {
    paths {
      "*" {
        metrics = on
      }
    }
  }
}
```

With the above configuration all service calls will be monitored and metrics generated will be under the service name “*:*”.

### Configure client service name

In the configuration below we use the setting `service-name` which means that metrics will be generated in the context of “accountService” and “customerService”.

```
cinnamon.akka.http.clients {
  "192.168.10.1:*" {
    service-name = "accountService"
    paths {
      "*" {
        metrics = on
      }
    }
  },
  "192.168.10.10:8080" {
    service-name = "customerService"
    paths {
      "*" {
        metrics = on
      }
    }
  }
}
```

### Configure specific client paths

It is also possible to define what paths of a service that should generate and contribute to the metrics.

```
cinnamon.akka.http.clients {
  "192.168.10.1:8080" {
    paths {
      "customer/address/*" {
        metrics = on
      }
    }
  }
}
```
Note
On the contrary to server endpoint metrics, in which unique metrics are created per path endpoint, any defined paths in client metrics configuration contribute to one overall metrics per service.

## Code Examples

### Example 1: Simple server configuration

```scala
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "*" {
        metrics = on
      }
    }
  }
}
```

### Example 2: Configure specific endpoint paths

```scala
cinnamon.akka.http.servers {
  "192.168.10.1:8080" {
    paths {
      "users/us/*" {
        metrics = on
      }
      "users/se/*" {
        metrics = on
      }
      "users/nz/*" {
        metrics = on
      }
    }
  }
}
```

### Example 3: Override and disable server metrics

```scala
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "*" {
        metrics = on
      }
    }
  },
  "192.168.0.1:*" {
    server-metrics = off
  }
}
```

### Example 4: Enable endpoint metrics per status code class

```scala
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "a/*" {
        metrics = on
      }
      "b/*" {
        metrics = on
        status-code-classes = on
      }
    }
  }
}
```

### Example 5: Enable endpoint metrics per status code

```scala
cinnamon.akka.http.servers {
  "*:*" {
    paths {
      "a/*" {
        metrics = on
      }
      "b/*" {
        metrics = on
        status-codes = on
      }
    }
  }
}
```

### Example 6: Simple client configuration

```scala
cinnamon.akka.http.clients {
  "*:*" {
    paths {
      "*" {
        metrics = on
      }
    }
  }
}
```

### Example 7: Configure client service name

```scala
cinnamon.akka.http.clients {
  "192.168.10.1:*" {
    service-name = "accountService"
    paths {
      "*" {
        metrics = on
      }
    }
  },
  "192.168.10.10:8080" {
    service-name = "customerService"
    paths {
      "*" {
        metrics = on
      }
    }
  }
}
```

### Example 8: Configure specific client paths

```scala
cinnamon.akka.http.clients {
  "192.168.10.1:8080" {
    paths {
      "customer/address/*" {
        metrics = on
      }
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-http/akka-http-api.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-http/akka-http-configuration.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-http/akka-http.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-http/akka-http-configuration.html](https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-http/akka-http-configuration.html)*