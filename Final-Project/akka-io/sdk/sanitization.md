---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:07Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/sanitization.html
title: 'Data sanitization :: Akka Documentation'
---

# Data sanitization :: Akka Documentation

## Content

# Data sanitization

## Overview

Data sanitization is a runtime\-level governance capability built into Akka. Rather than relying on application code to remember to scrub PII at every integration point, you declare your sanitization policy once and the runtime enforces it automatically — across logs, agent model inputs, and tool outputs.

This matters because protecting personally identifiable information is simultaneously a legal obligation and a trust imperative. Regulations such as GDPR, CCPA, and HIPAA mandate careful handling of personal data. The EU AI Act goes further: when AI systems process personal data, organizations must be able to explain what data was used and how it was protected. Runtime\-level PII scrubbing gives you a verifiable, auditable answer — sensitive information is masked before it ever reaches a model, satisfying both the right to erasure and the right to explanation.

By shifting sanitization from application logic into the runtime, you gain:

- **Consistency** — every code path that emits logs or feeds data to an agent is covered by the same policy.
- **Auditability** — governance and infosec teams can inspect a single configuration to verify what categories of PII are masked.
- **Reduced attack surface** — in the event of a breach, masked data limits exposure.

Sanitization is disabled by default. You enable it selectively through configuration, choosing exactly which categories of sensitive data to mask.

When enabled, sanitization is automatically applied to text that is:

- written to logs
- passed to agent models from agent requests
- passed to agent models from local tool or MCP tool output

Text matched by a sanitizer is replaced by a mask of `*` containing the same number of characters as the original matched string.

For example, with a credit card sanitizer enabled, the following text:

```
I'm having problems using my credit card 5204 46025 0000 006
```

Will be masked to:

```
I'm having problems using my credit card *******************
```

Before being written in logs or passed to agent models.

### Ad hoc sanitization

You can also apply sanitization programmatically in any component where it makes sense for a specific business case — for example, before sending text to a third\-party API or before writing text into the state of an entity. To do this, [inject](setup-and-dependency-injection.html) an `akka.javasdk.Sanitizer` in the component constructor and then call `akka.javasdk.Sanitizer#sanitize` on the text.

[SanitizingEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/api/SanitizingEndpoint.java)

```
@HttpEndpoint("/example-with-ad-hoc-sanitization")
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
public class SanitizingEndpoint {

  private final Sanitizer sanitizer;

  public SanitizingEndpoint(Sanitizer sanitizer) {
    this.sanitizer = sanitizer;
  }

  @Get("/somepath/{id}")
  public String returnSanitizedData(String id) {
    // String data from another component or a third party library/API
    String someText = loadText();
    String sanitizedText = sanitizer.sanitize(someText);
    return sanitizedText;
  }
```

## Sanitizer types

Two types of sanitizers are available, and you can combine predefined and custom sanitizers in the same service.

### Predefined

A small set of common sanitizers is built into the Akka runtime. You enable them by name in your configuration:

| Name | Description |
| --- | --- |
| `EMAIL` | email addresses |
| `PHONE` | International and national phone numbers |
| `CREDIT_CARD` | VISA, Mastercard, American Express, Diners, Discover, JCB, and generic credit card numbers |
| `IBAN` | international bank account numbers |
| `IP_ADDRESS` | ipv4 and ipv6 network addresses |

Enable one or more of these in your service `application.conf` file like this:

```
akka.javasdk.sanitization {
  predefined-sanitizers = ["IBAN", "CREDIT_CARD"]
}
```

### Custom

In many cases you need sanitizers specific to your application and business domain. Custom sanitizers let you define regular expressions that identify character sequences to mask.

You define custom sanitizers by adding a config block `akka.javasdk.sanitization.regex-sanitizers` with a name for each sanitizer, followed by a config block containing a single `pattern` key whose value is a valid Java regular expression matching the text to mask.

This example masks a hypothetical customer ID in the form S0123456789:

```
akka.javasdk.sanitization.regex-sanitizers = {
  "CUSTOMER_IDS" = { pattern = "S\\d{10}" }
}
```

This would cause text like:

```
Customer S0847362951 reported an issue with their order
```

To be masked to:

```
Customer *********** reported an issue with their order
```

Before being written in logs or passed to agent models.

## Performance considerations

Sanitization is applied to every log entry. In high\-throughput applications, numerous sanitization rules or complex regular expressions may impact performance. You should monitor application performance and optimize regex patterns if necessary.

## Testing sanitization

In tests you can access the sanitizer directly from the `getSanitizer` method in `TestKit` or `TestKitSupport` to assert that expected texts are masked given your service sanitizer configuration.

## See also

- [Governance \& the runtime](../concepts/governance-and-the-runtime.html) — How the Akka runtime enforces governance policies including sanitization, guardrails, and audit logging.
- [Guardrails](agents/guardrails.html) — Input and output guardrails that complement data sanitization for responsible AI.
- [Building Trustworthy AI](https://akka.io/blog/trustworthy-ai-with-akka) — Background on the design principles behind Akka’s governance capabilities.

## Code Examples

### Example 1: Ad hoc sanitization

```java
@HttpEndpoint("/example-with-ad-hoc-sanitization")
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
public class SanitizingEndpoint {

  private final Sanitizer sanitizer;

  public SanitizingEndpoint(Sanitizer sanitizer) {
    this.sanitizer = sanitizer;
  }

  @Get("/somepath/{id}")
  public String returnSanitizedData(String id) {
    // String data from another component or a third party library/API
    String someText = loadText();
    String sanitizedText = sanitizer.sanitize(someText);
    return sanitizedText;
  }
```

### Example 2: Predefined

```hocon
akka.javasdk.sanitization {
  predefined-sanitizers = ["IBAN", "CREDIT_CARD"]
}
```

### Example 3: Custom

```hocon
akka.javasdk.sanitization.regex-sanitizers = {
  "CUSTOMER_IDS" = { pattern = "S\\d{10}" }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/concepts/governance-and-the-runtime.html
- https://doc.akka.io/sdk/agents/guardrails.html
- https://doc.akka.io/sdk/setup-and-dependency-injection.html

---
*Source: [https://doc.akka.io/sdk/sanitization.html](https://doc.akka.io/sdk/sanitization.html)*