---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/security/2016-09-30-windows-directory-traversal.html
title: Directory Traversal in FileDirectives • Akka HTTP
---

# Directory Traversal in FileDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Directory Traversal in FileDirectives

## Date

30 September 2016

## Description

On Windows akka\-http’s `getFromDirectory`, `getFromBrowseableDirectory`, `getFromBrowseableDirectories`, and `listDirectoryContents` directives unintentionally allow access to directories and files outside of the specified directory. 

All directories and files on the same drive as the specified directory for which the server process has sufficient permissions may be downloaded or browsed. This can be easily exploited by using a specially crafted URI. 

For example, a specially crafted request `http://localhost:8080/%5c..%5c..%5c..%5c..%5c..%5c..%5c..%5c..%5c..%5cwindows/win.ini` when handled by one of the affected directives, could expose your win.ini (and potentially any other file) to the attacker.

## Impact

[Directory traversal attack](https://en.wikipedia.org/wiki/Directory_traversal_attack) in case the above vulnerable directives are used.

## Affected Versions

OS: 

- **Only Windows** operating systems are affected by this vulnerability.

Versions:

- akka\-http\-experimental **prior to** `2.4.11`
- spray\-routing and spray\-routing\-shapeless2 **prior to** `1.3.4`

Affected directives:

- `getFromDirectory`
- `getFromBrowseableDirectory`
- `getFromBrowseableDirectories`
- `listDirectoryContents`

## Fixed versions

- akka\-http\-experimental `2.4.11`
- akka\-http\-experimental `2.0.5` (legacy)
- spray `1.3.4`

The fixed versions are **binary\-compatible** with each of the affected versions, please upgrade as soon as you can.

## Recommendations

Following best security practices it is furthermore recommended to run the web server process with user credentials with as few permissions as possible to prevent unintended file access. 

Furthermore, we suggest using Linux servers and/or containers for hosting Akka HTTP applications, as these OSes receive more scrutiny than any other OS just because of the overwhelming number of installations running on Linux.

## Acknowledgements

Many thanks go to @roikonen for reporting the problem, @2beaucoup for providing a fix and @rbudzko and @jypma for providing advice for fixing the problem.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/introduction.html
- https://doc.akka.io/libraries/akka-http/current/security/2016.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/security/2016-09-30-windows-directory-traversal.html](https://doc.akka.io/libraries/akka-http/current/security/2016-09-30-windows-directory-traversal.html)*