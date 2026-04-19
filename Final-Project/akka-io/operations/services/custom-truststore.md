---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:33:02Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/services/custom-truststore.html
title: 'Configuring a custom JVM truststore :: Akka Documentation'
---

# Configuring a custom JVM truststore :: Akka Documentation

## Content

# Configuring a custom JVM truststore

Securing connectivity to other services may use TLS certificates signed by a Certificate Authority (CA) that is not included in the JVM truststore. Akka Services can be configured to extend the JVM truststore with additional CAs. Your truststore with custom CA certificates is merged with the JVM’s default trust store, so your service continues to trust standard public CAs alongside your private ones.

|  | To configure a custom truststore, the Akka Service must be deployed through a [service descriptor](deploy-service.html#apply). |
| --- | --- |

## Quick start

Follow these steps to configure a custom truststore for your Akka service.

### Create a PKCS12 truststore from your CA certificate

```
keytool -import -trustcacerts -alias myca \
  -file my-ca-cert.pem \
  -keystore my-truststore.p12 \
  -storetype PKCS12 \
  -storepass changeit \
  -noprompt
```

### Create a secret with the truststore and password

Import the PKCS12 file into an Akka Service secret.

```
akka secret create generic my-truststore \
  --from-file truststore.p12=my-truststore.p12 \
  --literal password=changeit
```

### Extend the Akka Service descriptor

Extend the Akka Service descriptor with a `tls` section to reference the service secret created above.

```
name: my-service
service:
  image: my-image:latest
  tls:
    truststore:
      secret:
        name: my-truststore
      key: truststore.p12
      type: PKCS12
      passwordKey: password
```

Akka supports the JKS and PKCS12 truststore formats. Use the `type` field in your configuration to specify the format (defaults to `JKS`).

### Apply the Akka Service descriptor

Apply the updated service configuration to the Akka Service.

```
akka service apply -f descriptor.yaml
```

## Configuration reference

For the full configuration reference, see [TLSConfig](../../reference/descriptors/service-descriptor.html#TLSConfig) in the service descriptor reference.

## Code Examples

### Example 1: Create a PKCS12 truststore from your CA certificate

```command
keytool -import -trustcacerts -alias myca \
  -file my-ca-cert.pem \
  -keystore my-truststore.p12 \
  -storetype PKCS12 \
  -storepass changeit \
  -noprompt
```

### Example 2: Create a secret with the truststore and password

```command
akka secret create generic my-truststore \
  --from-file truststore.p12=my-truststore.p12 \
  --literal password=changeit
```

### Example 3: Extend the Akka Service descriptor

```yaml
name: my-service
service:
  image: my-image:latest
  tls:
    truststore:
      secret:
        name: my-truststore
      key: truststore.p12
      type: PKCS12
      passwordKey: password
```

### Example 4: Apply the Akka Service descriptor

```command
akka service apply -f descriptor.yaml
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/services/deploy-service.html
- https://doc.akka.io/reference/descriptors/service-descriptor.html

---
*Source: [https://doc.akka.io/operations/services/custom-truststore.html](https://doc.akka.io/operations/services/custom-truststore.html)*