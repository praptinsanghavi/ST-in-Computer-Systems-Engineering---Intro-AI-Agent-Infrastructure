---
description: 'declaration: package: akka.javasdk.view'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:31Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html
title: akka.javasdk.view
---

# akka.javasdk.view

> **Summary:** declaration: package: akka.javasdk.view

## Content

# Package akka.javasdk.view

---

package akka.javasdk.view

[`View`](View.html "class in akka.javasdk.view") component.

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[EntryWithMetadata](EntryWithMetadata.html "class in akka.javasdk.view")\<T\>
 
[TableUpdater](TableUpdater.html "class in akka.javasdk.view")\<S\>

Responsible for consuming events from a source and emit updates to one view table.

[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")\<S\>

An UpdateEffect is a description of what the runtime needs to do after the command is handled.

[TableUpdater.Effect.Builder](TableUpdater.Effect.Builder.html "interface in akka.javasdk.view")\<S\>
 
[UpdateContext](UpdateContext.html "interface in akka.javasdk.view")

Context for view update calls.

[View](View.html "class in akka.javasdk.view")

A service that follows the Command Query Responsibility Segregation (CQRS) pattern.

[View.QueryEffect](View.QueryEffect.html "interface in akka.javasdk.view")\<T\>

Not for user extension, instances are returned through factory method {[`View.queryResult()`](View.html#queryResult())}

[View.QueryStreamEffect](View.QueryStreamEffect.html "interface in akka.javasdk.view")\<T\>

Not for user extension, instances are returned through factory method [`View.queryStreamResult()`](View.html#queryStreamResult())

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryStreamEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html)*