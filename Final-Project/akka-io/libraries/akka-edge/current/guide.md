---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-edge/current/guide.html
title: Guide - Java/Scala • Akka Edge
---

# Guide - Java/Scala • Akka Edge

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Guide \- Java/Scala

As a hands\-on guide we will step by step implement a drone restaurant to customer delivery service where orders for deliveries between restaurants and customers are created in a cloud hosted service.

The drones continuously inform their PoP (point of presence) local control center of their exact location. An approximate location of the drones is replicated to the cloud service at a much lower frequency, only when the drones change location on a coarse grained GPS coordinate grid.

The cloud service accepts restaurant orders and replicates them to the right control center. Drones interact with the local center to pick up available orders closest to their location.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-edge/current/feature-summary.html
- https://doc.akka.io/libraries/akka-edge/current/guide/1-local-drone-control-service.html

---
*Source: [https://doc.akka.io/libraries/akka-edge/current/guide.html](https://doc.akka.io/libraries/akka-edge/current/guide.html)*