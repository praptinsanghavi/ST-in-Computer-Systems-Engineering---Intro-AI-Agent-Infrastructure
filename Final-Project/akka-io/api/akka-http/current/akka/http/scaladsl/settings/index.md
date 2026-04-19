---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package settingsDefinition Classes[scaladsl](../index.html)
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
- [WebSocketSettings](WebSocketSettings.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# settings[**](../../../../akka/http/scaladsl/settings/index.html "Permalink")

#### package settings

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html "Permalink") abstract  class [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
2. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html "Permalink") abstract  class [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
3. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html "Permalink")  trait [CorsSettings](CorsSettings.html "Settings for the CORS support") extends [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)Settings for the CORS support

Settings for the CORS support

This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.

Not for user extension

Annotations@ApiMayChange() @DoNotInherit()
4. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html "Permalink")  trait [Http2ClientSettings](Http2ClientSettings.html) extends [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html) with Http2CommonSettingsAnnotations@ApiMayChange() @DoNotInherit()
5. [**](../../../../akka/http/scaladsl/settings/Http2ServerSettings.html "Permalink")  trait [Http2ServerSettings](Http2ServerSettings.html) extends [javadsl.settings.Http2ServerSettings](../../javadsl/settings/Http2ServerSettings.html) with Http2CommonSettingsAnnotations@ApiMayChange() @DoNotInherit()
6. [**](../../../../akka/http/scaladsl/settings/HttpsProxySettings.html "Permalink") abstract  class [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing") extends [javadsl.settings.HttpsProxySettings](../../javadsl/settings/HttpsProxySettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
7. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html "Permalink") abstract  class [ParserSettings](ParserSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
8. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html "Permalink") abstract  class [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Options that are in "preview" or "early access" mode.
These options may change and/or be removed within patch releases
without early notice (e.g. by moving them into a stable supported place).

Annotations@ApiMayChange() @DoNotInherit()
9. [**](../../../../akka/http/scaladsl/settings/RoutingSettings.html "Permalink") abstract  class [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.RoutingSettings](../../javadsl/settings/RoutingSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
10. [**](../../../../akka/http/scaladsl/settings/ServerSentEventSettings.html "Permalink") abstract  class [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Options that are in "preview" or "early access" mode.
These options may change and/or be removed within patch releases
without early notice (e.g. by moving them into a stable supported place).

Annotations@ApiMayChange() @DoNotInherit()
11. [**](../../../../akka/http/scaladsl/settings/ServerSettings.html "Permalink") abstract  class [ServerSettings](ServerSettings.html "Public API but not intended for subclassing") extends [javadsl.settings.ServerSettings](../../javadsl/settings/ServerSettings.html)Public API but not intended for subclassing

Public API but not intended for subclassing

Annotations@DoNotInherit()
12. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html "Permalink") abstract  class [WebSocketSettings](WebSocketSettings.html) extends [javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)Annotations@DoNotInherit()
### Value Members

1. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings$.html "Permalink")  object [ClientConnectionSettings](ClientConnectionSettings$.html) extends SettingsCompanion\[[ClientConnectionSettings](ClientConnectionSettings.html)]
2. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings$.html "Permalink")  object [ConnectionPoolSettings](ConnectionPoolSettings$.html) extends SettingsCompanion\[[ConnectionPoolSettings](ConnectionPoolSettings.html)]
3. [**](../../../../akka/http/scaladsl/settings/CorsSettings$.html "Permalink")  object [CorsSettings](CorsSettings$.html)
4. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings$.html "Permalink")  object [Http2ClientSettings](Http2ClientSettings$.html) extends SettingsCompanion\[[Http2ClientSettings](Http2ClientSettings.html)]Annotations@ApiMayChange()
5. [**](../../../../akka/http/scaladsl/settings/Http2ServerSettings$.html "Permalink")  object [Http2ServerSettings](Http2ServerSettings$.html) extends SettingsCompanion\[[Http2ServerSettings](Http2ServerSettings.html)]Annotations@ApiMayChange()
6. [**](../../../../akka/http/scaladsl/settings/HttpsProxySettings$.html "Permalink")  object [HttpsProxySettings](HttpsProxySettings$.html) extends SettingsCompanion\[[HttpsProxySettings](HttpsProxySettings.html)]
7. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html "Permalink")  object [ParserSettings](ParserSettings$.html) extends SettingsCompanion\[[ParserSettings](ParserSettings.html)]
8. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings$.html "Permalink")  object [PreviewServerSettings](PreviewServerSettings$.html) extends SettingsCompanion\[[PreviewServerSettings](PreviewServerSettings.html)]
9. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html "Permalink")  object [RoutingSettings](RoutingSettings$.html) extends SettingsCompanion\[[RoutingSettings](RoutingSettings.html)]
10. [**](../../../../akka/http/scaladsl/settings/ServerSentEventSettings$.html "Permalink")  object [ServerSentEventSettings](ServerSentEventSettings$.html) extends SettingsCompanion\[[ServerSentEventSettings](ServerSentEventSettings.html)]
11. [**](../../../../akka/http/scaladsl/settings/ServerSettings$.html "Permalink")  object [ServerSettings](ServerSettings$.html) extends SettingsCompanion\[[ServerSettings](ServerSettings.html)]
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html)*