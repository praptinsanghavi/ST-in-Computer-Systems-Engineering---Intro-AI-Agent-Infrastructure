---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:22:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/index.html
title: SecurityDirectives • Akka HTTP
---

# SecurityDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# SecurityDirectives

## Authentication vs. Authorization

**Authentication** is the process of establishing a known identity for the user, whereby ‘identity’ is defined in the context of the application. This may be done with a username/password combination, a cookie, a pre\-defined IP or some other mechanism. After authentication the system believes that it knows who the user is.

**Authorization** is the process of determining, whether a given user is allowed access to a given resource or not. In most cases, in order to be able to authorize a user (i.e. allow access to some part of the system) the users identity must already have been established, i.e. he/she must have been authenticated. Without prior authentication the authorization would have to be very crude, e.g. “allow access for *all* users” or “allow access for *noone*”. Only after authentication will it be possible to, e.g., “allow access to the statistics resource for *admins*, but not for regular *members*”.

Authentication and authorization may happen at the same time, e.g. when everyone who can properly be authenticated is also allowed access (which is often a very simple and somewhat implicit authorization logic). In other cases the system might have one mechanism for authentication (e.g. establishing user identity via an LDAP lookup) and another one for authorization (e.g. a database lookup for retrieving user access rights).

## Authentication and Authorization in HTTP

HTTP provides a general framework for access control and authentication, via an extensible set of challenge\-response authentication schemes, which can be used by a server to challenge a client request and by a client to provide authentication information. The general mechanism is defined in [RFC 7235](https://datatracker.ietf.org/doc/html/rfc7235).

The “HTTP Authentication Scheme Registry” defines the namespace for the authentication schemes in challenges and credentials. You can see the currently registered schemes at [IANA HTTP Authentication Scheme Registry](https://www.iana.org/assignments/http-authschemes/http-authschemes.xhtml).

At this point Akka HTTP only implements the “‘Basic’ HTTP Authentication Scheme” whose most current specification can be found here: <https://datatracker.ietf.org/doc/rfc7617/>.

## Low\-level OAuth2 “Bearer Token” directives

The OAuth2 directives currently provided in Akka HTTP are not a full OAuth2 protocol implementation, they are only a means of extracting the so called `Bearer Token` from the [`Authorization`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html "akka.http.javadsl.model.headers.Authorization")[`Authorization`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html "akka.http.scaladsl.model.headers.Authorization") HTTP Header, as defined in [RFC 6750](https://datatracker.ietf.org/doc/html/rfc6750), and allow users to validate and complete the protocol.

## Credentials and password timing attacks

When transforming request `Credentials` into an application specific user identifier the naive solution for checking the secret (password) would be a regular string comparison, but doing this would open up the application to timing attacks.

To protect users of the library from that mistake the secret is not available through the API, instead the method `Credentials.Provided.verify(String)` should be used. It does a constant time comparison rather than returning early upon finding the first non\-equal character.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/scheme.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/authenticateBasic.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/index.html)*