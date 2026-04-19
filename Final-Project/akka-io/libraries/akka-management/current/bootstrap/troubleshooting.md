---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/bootstrap/troubleshooting.html
title: Troubleshooting • Akka Management
---

# Troubleshooting • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Troubleshooting

## Logging

When troubleshooting cluster bootstrap, it could be helpful to enable `DEBUG` logging for:

- `akka.discovery`
- `akka.management.cluster.bootstrap`

## Kubernetes API `HTTP chunk size exceeds the configured limit` during contact point discovery

Increase the max chunk size with:

```
akka.http.client.parsing.max-chunk-size = 20m

```

This should only be necessary if the cluster size is 100s of nodes.

## Code Examples

### Example 1: Kubernetes APIHTTP chunk size exceeds the configured limitduring contact point discovery

```text
akka.http.client.parsing.max-chunk-size = 20m
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-management/current/bootstrap/details.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/local-config.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/bootstrap/troubleshooting.html](https://doc.akka.io/libraries/akka-management/current/bootstrap/troubleshooting.html)*