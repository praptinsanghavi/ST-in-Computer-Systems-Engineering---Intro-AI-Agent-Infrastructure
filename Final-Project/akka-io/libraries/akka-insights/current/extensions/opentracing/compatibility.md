---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:22Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/extensions/opentracing/compatibility.html
title: OpenTracing compatibility • Akka Insights
---

# OpenTracing compatibility • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# OpenTracing compatibility

Availability
Available since Cinnamon **2\.14\.2**

Under the hood, Akka Insights (Cinnamon) creates custom span objects (we call these “null” and “context\-only” spans) to propagate information between contexts. We’ve encountered some issues where these custom types clash with other OpenTracing bridge implementations (e.g., [Elastic APM OpenTracing bridge](https://www.elastic.co/guide/en/apm/agent/java/current/opentracing-bridge.html)) which can result in class cast exceptions similar to the following:

```
class cinnamon.opentracing.TraceLocal$ContextOnlySpan cannot be cast to class co.elastic.apm.opentracing.ApmSpan

```

Cinnamon supports disabling the internal generation of these custom types via two new config parameters:

Reference

```
cinnamon.opentracing {
  # Whether to allow null spans to be activated. Can be disabled if incompatible with tracer implementations.
  activate-null-spans = on

  # Whether to activate dummy spans for context-only trace propagation. Can be disabled if incompatible with tracer implementations.
  activate-context-only-spans = on
}
```

These configuration parameters can be set to `off` to prevent Cinnamon generating these spans.

Note
When context\-only spans are disabled, you might still need to access the current SpanContext to create a span connected to it. This can be done via `GlobalExtendedTracer`. See [this API section](api.html#globalextendedtracer-active-context) to see how to achieve it.

## Code Examples

### Example 1: OpenTracing compatibility

```text
class cinnamon.opentracing.TraceLocal$ContextOnlySpan cannot be cast to class co.elastic.apm.opentracing.ApmSpan
```

### Example 2: OpenTracing compatibility

```conf
cinnamon.opentracing {
  # Whether to allow null spans to be activated. Can be disabled if incompatible with tracer implementations.
  activate-null-spans = on

  # Whether to activate dummy spans for context-only trace propagation. Can be disabled if incompatible with tracer implementations.
  activate-context-only-spans = on
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/extensions/mdc.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/api.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/granularity.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/compatibility.html](https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/compatibility.html)*