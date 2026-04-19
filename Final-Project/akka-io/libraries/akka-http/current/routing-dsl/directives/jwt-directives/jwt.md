---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/jwt.html
title: jwt • Akka HTTP
---

# jwt • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# jwt

## Signature

```
def jwt(): Directive1[JwtClaims]
def jwt(settings: scaladsl.JwtSettings): Directive1[JwtClaims]
```

## Description

This directive provides a way to validate a JSON Web Token (JWT) from a request and extracts its claims for further processing. For details on what a valid JWT is, see [jwt.io](https://www.jwt.io/) or consult [RFC 7519](https://datatracker.ietf.org/doc/html/rfc7519).

JWTs are validated against a predefined secret or public key, depending on the used algorithm, and provided by configuration. The directive uses config defined under `akka.http.jwt`, or an explicitly provided `JwtSettings` instance.

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka HTTP Caching, add the module to your project:

sbt
```
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-jwt" % AkkaHttpVersion
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-jwt_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-jwt_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

## Example

The `jwt` directive will extract and validate a JWT from the request and provide the extracted claims to the inner route in the format of a `JwtClaims` instance, which offers utility methods to extract a specific claims:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/JwtDirectivesExamplesSpec.scala#L34-L53 "Go to snippet source")val route =
  jwt() {
    _.stringClaim("role") match {
      case Some("admin") => complete(s"You're in!")
      case _             => reject(AuthorizationFailedRejection)
    }
  }

// tests:

// regular request

// manually injected valid JWT for test purposes with a claim "role" -> "admin"
val jwtToken = Authorization(OAuth2BearerToken(
  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwicm9sZSI6ImFkbWluIn0.6JBvEPNY4KVZpZYfoG6y5UOh3RLUbG-kPyxKHim_La8"))

Get() ~> addHeader(jwtToken) ~> route ~> check {
  responseAs[String] shouldEqual "You're in!"
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/JwtDirectivesExamplesTest.java#L16-L22 "Go to snippet source")final Route route = jwt(claims -> {
        if (claims.getStringClaim("sub").isPresent())
            return Directives.complete(claims.getStringClaim("sub").get());
        else
            return Directives.reject(AuthorizationFailedRejection.get());
    }
);
```

## Reference configuration

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-jwt/src/main/resources/reference.conf#L10-L52 "Go to snippet source")jwt {
  # Enables or disables the JWT signature validation.
  # This is useful for development and testing purposes
  # where you can still assert presence of claims without using a real signature.
  dev = off

  # The realm to use in the WWW-Authenticate header when a token is missing or invalid.
  realm = "akka-http-jwt"

  # Allows configuration for the JWT secrets used to verify tokens.
  # The list of supported algorithms is as follows:
  # - symmetric: HMD5, HS224, HS256, HS384 and HS512
  # - asymmetric: RS256, RS384, RS512, ES256, ES384, ES512 and Ed25519
  # Symmetric algorithms require either a secret in 'secret' or a filesystem path with a secret via 'secret-path', the former is ignored and the later takes precedence.
  # Asymmetric algorithms require a filesystem path for a public key via 'public-key'.
  #
  # An example config would be:
  # secrets: [
  #             {
  #               # The key-id is mandatory and should be unique for each secret.
  #               key-id: my-key-symmetric
  #               # The issuer is optional and can be used to validate the 'iss' claim.
  #               issuer: my-issuer
  #               algorithm: HS256
  #               # The secret can be set via an environment variable or loaded from a file.
  #               # To load the secret from an environment variables use:
  #               secret: ${MY_PRECIOUS_SECRET}
  #               # To load the secret from a file use (and remove the above secret setting):
  #               # secret-path: /path/to/secret.key
  #             },
  #             {
  #               key-id: my-key-asymmetric
  #               issuer: my-issuer
  #               algorithm: RS256
  #               # The public key used for JWT validation should be provided with the following setting:
  #               public-key: /path/to/public.key
  #             }
  #          ]
  #
  # NOTE: If configuring multiple secrets for the same algorithm, the first one found will be used
  # in cases where the Key Id ("kid") is not specified in the JWT token header.
  secrets: []
}
```

## Code Examples

### Example 1: Signature

```scala
def jwt(): Directive1[JwtClaims]
def jwt(settings: scaladsl.JwtSettings): Directive1[JwtClaims]
```

### Example 2: Dependency

```scala
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-jwt" % AkkaHttpVersion
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-jwt_${versions.ScalaBinary}"
}
```

### Example 4: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-jwt_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 5: Example

```scala
val route =
  jwt() {
    _.stringClaim("role") match {
      case Some("admin") => complete(s"You're in!")
      case _             => reject(AuthorizationFailedRejection)
    }
  }

// tests:

// regular request

// manually injected valid JWT for test purposes with a claim "role" -> "admin"
val jwtToken = Authorization(OAuth2BearerToken(
  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwicm9sZSI6ImFkbWluIn0.6JBvEPNY4KVZpZYfoG6y5UOh3RLUbG-kPyxKHim_La8"))

Get() ~> addHeader(jwtToken) ~> route ~> check {
  responseAs[String] shouldEqual "You're in!"
}
```

### Example 6: Example

```java
final Route route = jwt(claims -> {
        if (claims.getStringClaim("sub").isPresent())
            return Directives.complete(claims.getStringClaim("sub").get());
        else
            return Directives.reject(AuthorizationFailedRejection.get());
    }
);
```

### Example 7: Reference configuration

```conf
jwt {
  # Enables or disables the JWT signature validation.
  # This is useful for development and testing purposes
  # where you can still assert presence of claims without using a real signature.
  dev = off

  # The realm to use in the WWW-Authenticate header when a token is missing or invalid.
  realm = "akka-http-jwt"

  # Allows configuration for the JWT secrets used to verify tokens.
  # The list of supported algorithms is as follows:
  # - symmetric: HMD5, HS224, HS256, HS384 and HS512
  # - asymmetric: RS256, RS384, RS512, ES256, ES384, ES512 and Ed25519
  # Symmetric algorithms require either a secret in 'secret' or a filesystem path with a secret via 'secret-path', the former is ignored and the later takes precedence.
  # Asymmetric algorithms require a filesystem path for a public key via 'public-key'.
  #
  # An example config would be:
  # secrets: [
  #             {
  #               # The key-id is mandatory and should be unique for each secret.
  #               key-id: my-key-symmetric
  #               # The issuer is optional and can be used to validate the 'iss' claim.
  #               issuer: my-issuer
  #               algorithm: HS256
  #               # The secret can be set via an environment variable or loaded from a file.
  #               # To load the secret from an environment variables use:
  #               secret: ${MY_PRECIOUS_SECRET}
  #               # To load the secret from a file use (and remove the above secret setting):
  #               # secret-path: /path/to/secret.key
  #             },
  #             {
  #               key-id: my-key-asymmetric
  #               issuer: my-issuer
  #               algorithm: RS256
  #               # The public key used for JWT validation should be provided with the following setting:
  #               public-key: /path/to/public.key
  #             }
  #          ]
  #
  # NOTE: If configuring multiple secrets for the same algorithm, the first one found will be used
  # in cases where the Key Id ("kid") is not specified in the JWT token header.
  secrets: []
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/jwt.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/jwt.html)*