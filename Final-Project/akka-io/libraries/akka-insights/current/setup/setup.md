---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/setup/setup.html
title: Setup • Akka Insights
---

# Setup • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Setup

Akka Insights uses a Java Agent to add specially crafted instrumentation to the components of our platforms which facilitates efficient telemetry.

The [Commercial credentials](setup.html#commercial-credentials), Cinnamon Agent, [Instrumentation](../instrumentations/instrumentations.html) and [Backend Plugin](../plugins/plugins.html) are required for both build and deployment to enable telemetry. The sections below describe how to go about for the most common build tools.

## Commercial credentials

To gain access to Akka Insights you must have an Akka subscription and an [Akka account](https://account.akka.io/account).

Once you have logged in, the [Akka platform credentials](https://account.akka.io/private-repository/credentials) guide contains instructions for configuring your sbt, maven or gradle project to access Akka Insights. If you have previously used a username and password to configure your commercial credentials, the guide will instruct you how to update to using the new scheme.

Note
The URLs generated as part of your Akka credentials should not be committed to public source control repositories.

If you do not have an Akka subscription, please [contact us](https://akka.io/contact-us) to request an evaluation.

## Build tools

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/instrumentations.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/current/sandbox/graphite-sandbox.html
- https://doc.akka.io/libraries/akka-insights/current/setup/cinnamon-agent-sbt.html
- https://doc.akka.io/libraries/akka-insights/current/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/setup/setup.html](https://doc.akka.io/libraries/akka-insights/current/setup/setup.html)*