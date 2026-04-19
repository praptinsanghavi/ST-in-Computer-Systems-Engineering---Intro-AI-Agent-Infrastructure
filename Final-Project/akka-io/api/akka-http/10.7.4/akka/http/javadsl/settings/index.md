---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:04:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package settingsDefinition Classes[javadsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing")
- [CorsSettings](CorsSettings.html "Settings for the CORS support")
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [SettingsCompanion](SettingsCompanion.html)
- [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing")
- [**](../../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[javadsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html)

# settings[**](../../../../akka/http/javadsl/settings/index.html "Permalink")

#### package settings

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html "Permalink") abstract  class [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
2. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html "Permalink") abstract  class [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
3. [**](../../../../akka/http/javadsl/settings/CorsSettings.html "Permalink") abstract  class [CorsSettings](CorsSettings.html "Settings for the CORS support") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings for the CORS support

Settings for the CORS support

This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.

Not for user extension

Annotations@DoNotInherit()
4. [**](../../../../akka/http/javadsl/settings/Http2ClientSettings.html "Permalink")  trait [Http2ClientSettings](Http2ClientSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html "Permalink")  trait [Http2ServerSettings](Http2ServerSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@DoNotInherit()
6. [**](../../../../akka/http/javadsl/settings/HttpsProxySettings.html "Permalink") abstract  class [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
7. [**](../../../../akka/http/javadsl/settings/ParserSettings.html "Permalink") abstract  class [ParserSettings](ParserSettings.html "Public API but not intended for subclassing") extends SettingsPublic API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
8. [**](../../../../akka/http/javadsl/settings/PreviewServerSettings.html "Permalink") abstract  class [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Options that are in "preview" or "early access" mode.
These options may change and/or be removed within patch releases
without early notice (e.g. by moving them into a stable supported place).

Annotations@ApiMayChange() @DoNotInherit()
9. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html "Permalink") abstract  class [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
10. [**](../../../../akka/http/javadsl/settings/ServerSentEventSettings.html "Permalink") abstract  class [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Options that are in "preview" or "early access" mode.
These options may change and/or be removed within patch releases
without early notice (e.g. by moving them into a stable supported place).

Annotations@ApiMayChange() @DoNotInherit()
11. [**](../../../../akka/http/javadsl/settings/ServerSettings.html "Permalink") abstract  class [ServerSettings](ServerSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
12. [**](../../../../akka/http/javadsl/settings/SettingsCompanion.html "Permalink")  trait [SettingsCompanion](SettingsCompanion.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
13. [**](../../../../akka/http/javadsl/settings/WebSocketSettings.html "Permalink")  trait [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
### Value Members

1. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings$.html "Permalink")  object [ClientConnectionSettings](ClientConnectionSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[ClientConnectionSettings](ClientConnectionSettings.html)]
2. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings$.html "Permalink")  object [ConnectionPoolSettings](ConnectionPoolSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[ConnectionPoolSettings](ConnectionPoolSettings.html)]
3. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings$.html "Permalink")  object [Http2ServerSettings](Http2ServerSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[Http2ServerSettings](Http2ServerSettings.html)]
4. [**](../../../../akka/http/javadsl/settings/HttpsProxySettings$.html "Permalink")  object [HttpsProxySettings](HttpsProxySettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[HttpsProxySettings](HttpsProxySettings.html)]
5. [**](../../../../akka/http/javadsl/settings/ParserSettings$.html "Permalink")  object [ParserSettings](ParserSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[ParserSettings](ParserSettings.html)]
6. [**](../../../../akka/http/javadsl/settings/PreviewServerSettings$.html "Permalink")  object [PreviewServerSettings](PreviewServerSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[PreviewServerSettings](PreviewServerSettings.html)]
7. [**](../../../../akka/http/javadsl/settings/RoutingSettings$.html "Permalink")  object [RoutingSettings](RoutingSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[RoutingSettings](RoutingSettings.html)]
8. [**](../../../../akka/http/javadsl/settings/ServerSettings$.html "Permalink")  object [ServerSettings](ServerSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[ServerSettings](ServerSettings.html)]
9. [**](../../../../akka/http/javadsl/settings/WebSocketSettings$.html "Permalink")  object [WebSocketSettings](WebSocketSettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html)*