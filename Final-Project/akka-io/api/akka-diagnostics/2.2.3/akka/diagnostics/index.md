---
description: Akka Dependencies 2.2.3 - akka.diagnostics
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:42:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-diagnostics/current/akka/diagnostics/index.html
title: Akka Dependencies 2.2.3 - akka.diagnostics
---

# Akka Dependencies 2.2.3 - akka.diagnostics

> **Summary:** Akka Dependencies 2.2.3 - akka.diagnostics

## Content

Akka Dependencies2\.2\.3 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/diagnostics/index.html "Permalink")  package diagnosticsDefinition Classes[akka](../index.html)
- [ConfigChecker](ConfigChecker.html "The ConfigChecker will try to find potential configuration issues. It is run when the actor system is started. It also possible to run it as a Java main program, see ConfigChecker#main.")
- [DiagnosticsExtension](DiagnosticsExtension.html)
- [StarvationDetector](StarvationDetector$.html)
- [StarvationDetectorSettings](StarvationDetectorSettings.html)
p[akka](../index.html)

# diagnostics[**](../../akka/diagnostics/index.html "Permalink")

#### package diagnostics

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/diagnostics/ConfigChecker.html "Permalink")  class [ConfigChecker](ConfigChecker.html "The ConfigChecker will try to find potential configuration issues. It is run when the actor system is started. It also possible to run it as a Java main program, see ConfigChecker#main.") extends AnyRefThe `ConfigChecker will try to find potential configuration issues. It is run when the actor system is started. It
also possible to run it as a Java main program, see [ConfigChecker#main](ConfigChecker$.html#main(args:Array[String]):Unit).`

The `ConfigChecker will try to find potential configuration issues. It is run when the actor system is started. It
also possible to run it as a Java main program, see [ConfigChecker#main](ConfigChecker$.html#main(args:Array[String]):Unit).`

Detailed documentation can be found in the `akka.diagnostics.checker` section of the reference.conf and in the
"Configuration Checker" section of the Akka Reference Documentation.
2. [**](../../akka/diagnostics/DiagnosticsExtension.html "Permalink")  class [DiagnosticsExtension](DiagnosticsExtension.html) extends Extension
3. [**](../../akka/diagnostics/StarvationDetectorSettings.html "Permalink") final  class [StarvationDetectorSettings](StarvationDetectorSettings.html) extends AnyRef
### Value Members

1. [**](../../akka/diagnostics/ConfigChecker$.html "Permalink")  object [ConfigChecker](ConfigChecker$.html)
2. [**](../../akka/diagnostics/DiagnosticsExtension$.html "Permalink")  object [DiagnosticsExtension](DiagnosticsExtension$.html "The diagnostics extension enables the StarvationDetector and reports configuration issues with ConfigChecker for an ActorSystem.") extends ExtensionId\[[DiagnosticsExtension](DiagnosticsExtension.html)] with ExtensionIdProviderThe diagnostics extension enables the [StarvationDetector](StarvationDetector$.html) and reports configuration issues with [ConfigChecker](ConfigChecker.html)
for an `ActorSystem`.

The diagnostics extension enables the [StarvationDetector](StarvationDetector$.html) and reports configuration issues with [ConfigChecker](ConfigChecker.html)
for an `ActorSystem`. This extension is automatically activated when the `akka-diagnostics` dependency is included.
3. [**](../../akka/diagnostics/StarvationDetector$.html "Permalink")  object [StarvationDetector](StarvationDetector$.html)
4. [**](../../akka/diagnostics/StarvationDetectorSettings$.html "Permalink")  object [StarvationDetectorSettings](StarvationDetectorSettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/ConfigChecker$.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/ConfigChecker.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/DiagnosticsExtension$.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/DiagnosticsExtension.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/StarvationDetector$.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/StarvationDetectorSettings$.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/StarvationDetectorSettings.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/index.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/index.html
- https://doc.akka.io/api/akka-diagnostics/2.2.3/index.html

---
*Source: [https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/index.html](https://doc.akka.io/api/akka-diagnostics/2.2.3/akka/diagnostics/index.html)*