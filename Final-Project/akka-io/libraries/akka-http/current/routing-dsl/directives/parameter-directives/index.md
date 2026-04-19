---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
title: ParameterDirectives • Akka HTTP
---

# ParameterDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ParameterDirectives

## When to use which parameter directive?

Usually, you want to use the high\-level [parameters](parameters.html) directive. When you need more low\-level access you can use the table below to decide which directive to use which shows properties of different parameter directives.

| directive | level | ordering | multi |
| --- | --- | --- | --- |
| [parameter](parameter.html) | high | no | no |
| [parameters](parameters.html) | high | no | yes |
| [parameterMap](parameterMap.html) | low | no | no |
| [parameterMultiMap](parameterMultiMap.html) | low | no | yes |
| [parameterSeq](parameterSeq.html)[parameterList](parameterSeq.html) | low | yes | yes |

level
high\-level parameter directives extract subset of all parameters by name and allow conversions and automatically report errors if expectations are not met, low\-level directives give you all parameters at once, leaving all further processing to you
ordering
original ordering from request URL is preserved
multi
multiple values per parameter name are possible
Note
If you need to extract multiple parameters, apply the `parameter` directive multiple times.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMultiMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterSeq.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html)*