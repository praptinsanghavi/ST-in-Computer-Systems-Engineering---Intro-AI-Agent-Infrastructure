---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/troubleshooting.html
title: Troubleshooting • Akka Persistence R2DBC Documentation
---

# Troubleshooting • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Troubleshooting

## Failing to use the configured plugin

If you see something like this, where the driver is not available:

```
 Unable to create a ConnectionFactory for 'ConnectionFactoryOptions{options={...}}'. Available drivers: [ pool ]

```

It is likely because you are building a shaded jar with all dependencies and the ´META\-INF/services\` entry for the R2DBC driver for the database you are using got lost.

If using maven shading plugin, make sure to use the [ServicesResourceTransformer](https://maven.apache.org/plugins/maven-shade-plugin/examples/resource-transformers.html#ServicesResourceTransformer). 

For other build tools, make sure the tool merges `META-INF/services/io.r2dbc.spi.ConnectionFactoryProvider` files rather than dropping one when there is a conflict.

## Code Examples

### Example 1: Failing to use the configured plugin

```text
Unable to create a ConnectionFactory for 'ConnectionFactoryOptions{options={...}}'. Available drivers: [ pool ]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/contributing.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/native-image.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/current/troubleshooting.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/troubleshooting.html)*