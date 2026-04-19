---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:19Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/services/service-config.html
title: 'Service configuration overrides :: Akka Documentation'
---

# Service configuration overrides :: Akka Documentation

## Content

# Service configuration overrides

Service configs allow you to provide [HOCON](https://github.com/lightbend/config/blob/main/HOCON.md) configuration that overrides a service’s `application.conf`. This is useful for tuning settings per environment without rebuilding the service image.

A service config is a named resource in an Akka project. Once created, it can be associated with a service. When the service starts, the configuration from the service config is loaded and overrides matching keys in the service’s bundled `application.conf`.

## Managing service configs

### Creating a service config

Create a service config from a HOCON file:

```
akka service-configs create my-config --from-file /path/to/config.conf
```

The file should contain valid HOCON configuration. For example:

config.conf

```
some.setting = "value"
another.setting = 42
```

You can also read from stdin using `-` as the file path:

```
cat config.conf | akka service-configs create my-config --from-file -
```

If a service config with the given name already exists, it will be updated with the new content.

### Listing service configs

```
akka service-configs list
```

### Getting a service config

```
akka service-configs get my-config
```

### Deleting a service config

```
akka service-configs delete my-config
```

|  | A service config cannot be deleted while it is referenced by a service. |
| --- | --- |

## Associating a service config with a service

To apply a service config to a service:

```
akka services set-config my-service --service-config my-config
```

The service config must exist before it can be associated with a service. After setting the config, restart the service for changes to take effect.

To remove the association:

```
akka services remove-config my-service
```

A service config can also be referenced in a service descriptor using the `serviceConfig` field:

```
name: my-service
service:
  image: my-image:1.0.0
  serviceConfig: my-config
  resources:
    runtime:
      mode: embedded
```

## See also

- [`akka service-configs` commands](../../reference/cli/akka-cli/akka_service-configs.html)
- [`akka services set-config` command](../../reference/cli/akka-cli/akka_services_set-config.html)
- [`akka services remove-config` command](../../reference/cli/akka-cli/akka_services_remove-config.html)
- [ServiceConfig in project descriptor](../../reference/descriptors/project-descriptor.html#service-config)

## Code Examples

### Example 1: Creating a service config

```command
akka service-configs create my-config --from-file /path/to/config.conf
```

### Example 2: Creating a service config

```hocon
some.setting = "value"
another.setting = 42
```

### Example 3: Creating a service config

```command
cat config.conf | akka service-configs create my-config --from-file -
```

### Example 4: Listing service configs

```command
akka service-configs list
```

### Example 5: Getting a service config

```command
akka service-configs get my-config
```

### Example 6: Deleting a service config

```command
akka service-configs delete my-config
```

### Example 7: Associating a service config with a service

```command
akka services set-config my-service --service-config my-config
```

### Example 8: Associating a service config with a service

```command
akka services remove-config my-service
```

### Example 9: Associating a service config with a service

```yaml
name: my-service
service:
  image: my-image:1.0.0
  serviceConfig: my-config
  resources:
    runtime:
      mode: embedded
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_service-configs.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_remove-config.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_set-config.html
- https://doc.akka.io/reference/descriptors/project-descriptor.html

---
*Source: [https://doc.akka.io/operations/services/service-config.html](https://doc.akka.io/operations/services/service-config.html)*