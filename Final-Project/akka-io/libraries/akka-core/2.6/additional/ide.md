---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/additional/ide.html
title: IDE Tips • Akka Documentation
---

# IDE Tips • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# IDE Tips

## Configure the auto\-importer in IntelliJ / Eclipse

For a smooth development experience, when using an IDE such as Eclipse or IntelliJ, you can disable the auto\-importer from suggesting `javadsl` imports when working in Scala, or viceversa.

In IntelliJ, the auto\-importer settings are under “Editor” / “General” / “Auto Import”. Use a name mask such as `akka.stream.javadsl*` or `akka.stream.scaladsl*` or `*javadsl*` or `*scaladsl*` to indicate the DSL you want to exclude from import/completion. See screenshot below: 

![idetip-auto-importer-solution.png](../images/idetip-auto-importer-solution.png)

Eclipse users can configure this aspect of the IDE by going to “Window” / “Preferences” / “Java” / “Appearance” / “Type Filters”.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/common/may-change.html
- https://doc.akka.io/libraries/akka-core/2.6/project/immutable.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/additional/ide.html](https://doc.akka.io/libraries/akka-core/2.6/additional/ide.html)*