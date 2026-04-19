---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:59Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/observability-and-monitoring/observability-exports.html
title: 'Exporting metrics, logs, and traces :: Akka Documentation'
---

# Exporting metrics, logs, and traces :: Akka Documentation

## Content

# Exporting metrics, logs, and traces

Akka supports exporting metrics, logs, and traces to a variety of different destinations for reporting, long term storage and alerting. Metrics, logs, and traces can either be exported to the same location, by configuring default exporters, or to different locations by configuring separate logging, metrics, and tracing exporters. Multiple exporters can be configured for each category, allowing you to send the same data to multiple destinations simultaneously.

Observability configuration is configured per Akka project. All services in that project will use the same observability config. Configuration can either be done by specifying an observability descriptor, or by running CLI commands.

When updating observability configuration, the changes will not take effect until a service is restarted.

## Exported metrics

For a complete list of metrics recorded and exported by Akka, see the [metrics reference](../../reference/telemetry/metrics.html).

## Working with observability descriptors

The Akka observability descriptor allows observability export configuration to be specified in a YAML file, for versioning and reuse across projects and environments.

### Exporting the observability configuration

To export the current configuration, run:

```
akka project observability export
```

This will write the observability YAML descriptor out to standard out. If preferred, the `-f` argument can be used to specify a file to write the descriptor out to.

```
resource: Observability
resourceVersion: v2
spec:
  exporters:
    - kalixConsole: {}
  logs:
    - googleCloud:
        serviceAccountKeySecret:
          name: gcp-credentials
    - kalixConsole: {}
  metrics: []
  traces: []
```

In this example:

- The `exporters` section defines default exporters applied to logs, metrics, and traces.
- The `logs` section overrides the default exporters for logs. It configures both a Google Cloud exporter and the Akka Console exporter. Without explicitly including `kalixConsole` here, logs would only be sent to Google Cloud.
- The `metrics` and `traces` sections are empty arrays, meaning they use the default exporters.

Each section (`exporters`, `logs`, `metrics`, `traces`) accepts an array of exporter configurations, allowing multiple destinations. When a specific `logs`, `metrics`, or `traces` section is defined, it **replaces** the default exporters for that category. To continue sending data to a default destination, you must include it in the specific section as well. An empty array (`[]`) means the category falls back to the default exporters.

|  | All configuration details are listed in [Observability Descriptor reference](../../reference/descriptors/observability-descriptor.html). |
| --- | --- |

### Updating the observability configuration

To update the current configuration, run:

```
akka project observability apply -f observability.yaml
```

Where `observability.yaml` is the path to the YAML descriptor.

### Editing the observability configuration in place

If you just want to edit the observability configuration for your project, without exporting and then applying it again, run:

```
akka project observability edit
```

This will open the observability descriptor in a text editor. After saving and exiting the editor, the saved descriptor will be used to update the configuration.

|  | After updating your observability configuration, you will need to restart a service to apply the new configuration. Akka automatically makes that a rolling restart. |
| --- | --- |

### Activating tracing (Beta)

The generation of traces is disabled by default. To enable it you need to set [telemetry/tracing/enabled](../../reference/descriptors/service-descriptor.html#_servicespec) to `true` in the service descriptor. Like the following:

```
name: <<service-name>>
service:
  telemetry:
    tracing:
      enabled: true
  image: <<docker-image>>
```

[Deploy the service with the descriptor](../services/deploy-service.html#apply).

Once this is set, Akka will start generating [spans](https://opentelemetry.io/docs/concepts/observability-primer/#spans) for the following components: Event Sourced Entities, Key Value Entities, Endpoints, Consumers, and Views.

Another possible use is to add a `traceparent` header when calling your Akka endpoint. In this case Akka will propagate this trace parent as the root of the subsequent interaction with an Akka component. Linking each Akka call to that external trace parent.

#### Setting sampling

By default, Akka filters traces and exports them to your Akka Console. You’ll get 1% of the traces produced by your services. You can adjust this percentage according to your needs.

This filtering is known as [head sampling](https://opentelemetry.io/docs/concepts/sampling/#head-sampling). Sampling is configured at the top level of the observability descriptor using `traceSampling` and applies to all configured trace exporters. To configure it, set your observability descriptor as follows and [update the observability configuration](#_updating_the_observability_configuration):

```
resource: Observability
resourceVersion: v2
spec:
  exporters:
    - kalixConsole: {}
  traces:
    - otlp:
        endpoint: traces.example.com:4317
  traceSampling:
    probabilistic:
      percentage: "2"
```

With this configuration, 2% of the traces are sent while the 98% are filtered. More on how much sampling [here](https://opentelemetry.io/docs/concepts/sampling/#when-to-sample).

## Updating the configuration using commands

The Akka observability configuration can also be updated using commands. To view a human\-readable summary of the observability configuration, run:

```
akka project observability get
```

### Adding exporters

To add an exporter to the configuration, use the `add` command. This appends the exporter to the existing configuration without removing any previously configured exporters.

```
akka project observability add default otlp --endpoint otlp.example.com:4317
akka project observability add logs google-cloud --service-account-key-secret gcp-credentials
akka project observability add metrics prometheus --endpoint https://prometheus.example.com/api/v1/push
akka project observability add traces otlp --endpoint traces.example.com:4317
```

### Removing exporters

To remove an exporter from the configuration, use the `remove` command.

```
akka project observability remove default otlp --endpoint otlp.example.com:4317
akka project observability remove logs google-cloud --service-account-key-secret gcp-credentials
```

### Replacing all exporters

To completely replace all exporters for a category, use the `set` command. This removes all existing exporters in the specified category and replaces them with the new configuration.

```
akka project observability set default otlp --endpoint otlp.example.com:4317
```

|  | When using the `set` command, all existing exporters in that category (default, logs, metrics, or traces) will be removed and replaced with the new exporter. Use `add` if you want to keep existing exporters. |
| --- | --- |

## Supported exporters

Akka supports a number of different destinations to export metrics, logs, and traces to. The example commands and configuration below will show configuring the default exporter, if the exporter supports metrics, logs, and traces, or the metrics, logs, or traces as applicable if not.

### Akka Console

The Akka Console is the default destination for metrics and traces. It provides a built\-in, short term time series database for limited dashboards displayed in the Akka Console. To configure it:

Descriptor

```
exporters:
  - kalixConsole: {}
```

CLI

```
akka project observability add default akka-console
```

### OTLP

OTLP is the gRPC based protocol used by OpenTelemetry. It is supported for logs, metrics, and traces. The primary piece of configuration it needs is an endpoint. For example:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4317
```

CLI

```
akka project observability add default otlp --endpoint otlp.example.com:4317
```

In addition, the OTLP exporter supports [TLS configuration](#_tls_configuration) and [custom headers](#_custom_headers). A full reference of configuration options is available in [the reference documentation](../../reference/descriptors/observability-descriptor.html#_observabilityotlp).

### OTLP HTTP

OTLP HTTP is the HTTP\-based protocol used by OpenTelemetry, as an alternative to the gRPC\-based OTLP exporter. It is supported for logs, metrics, and traces. This exporter is useful in environments where HTTP is preferred over gRPC, such as when behind proxies or firewalls that don’t support HTTP/2\.

The primary piece of configuration it needs is a base URL endpoint. The exporter will automatically append the appropriate path for logs, metrics, or traces (e.g., `/v1/logs`, `/v1/metrics`, `/v1/traces`).

Descriptor

```
exporters:
  - otlpHttp:
      endpointBaseUrl: https://otlp.example.com:4318
```

CLI

```
akka project observability add default otlp-http --endpoint-base-url https://otlp.example.com:4318
```

By default, the exporter uses Protobuf encoding. To use JSON encoding instead:

Descriptor

```
exporters:
  - otlpHttp:
      endpointBaseUrl: https://otlp.example.com:4318
      encoding: json
```

CLI

```
akka project observability add default otlp-http \
  --endpoint-base-url https://otlp.example.com:4318 \
  --encoding json
```

In addition, the OTLP HTTP exporter supports [TLS configuration](#_tls_configuration) and [custom headers](#_custom_headers). A full reference of configuration options is available in [the reference documentation](../../reference/descriptors/observability-descriptor.html#_observabilityotlphttp).

### Prometheus Remote Write

The Prometheus remote write protocol is supported for exporting metrics. It is generally used to write metrics into Cortex and similar long term metrics databases for Prometheus. The primary piece of configuration it needs is an endpoint. For example:

Descriptor

```
metrics:
  - prometheuswrite:
      endpoint: https://prometheus.example.com/api/v1/push
```

CLI

```
akka project observability add metrics prometheus --endpoint https://prometheus.example.com/api/v1/push
```

In addition, the Prometheus exporter supports [TLS configuration](#_tls_configuration) and [custom headers](#_custom_headers). A full reference of configuration options is available in [the reference documentation](../../reference/descriptors/observability-descriptor.html#_observabilityprometheuswrite).

### Splunk HEC

The Splunk HTTP Event Collector protocol is supported for exporting both metrics and logs. It is used to export to the Splunk platform. It needs an endpoint and a splunk token. The Splunk token must be configured as a [Akka secret](../projects/secrets.html), which then gets referenced from the observability configuration.

Descriptor

```
exporters:
  - splunkHec:
      endpoint: https://<my-trial-instance>.splunkcloud.com:8088/services/collector
      tokenSecret:
        name: my-splunk-token
        key: token
```

CLI

```
akka project observability add default splunk-hec \
  --endpoint https://<my-trial-instance>.splunkcloud.com:8088/services/collector \
  --token-secret-name my-splunk-token --token-secret-key token
```

In addition, the Splunk HEC exporter supports [TLS configuration](#_tls_configuration). A full reference of configuration options is available in [the reference documentation](../../reference/descriptors/observability-descriptor.html#_observabilitysplunkhec).

### Azure Monitor

Azure Monitor is supported for exporting logs, metrics, and traces. The primary piece of configuration it needs is an Azure Monitor connection string, which can be obtained from your Application Insights resource in the Azure portal.

|  | Replace the `XXXXXXXX` placeholder values with the actual values from your Azure Application Insights connection string. |
| --- | --- |

Descriptor

```
exporters:
  - azureMonitor:
      connectionString: InstrumentationKey=XXXXXXXX;IngestionEndpoint=https://centralus-2.in.applicationinsights.azure.com/;LiveEndpoint=https://centralus.livediagnostics.monitor.azure.com/;ApplicationId=XXXXXXXX
```

CLI

```
akka project observability add default azure-monitor \
  --connection-string "InstrumentationKey=XXXXXXXX;IngestionEndpoint=https://centralus-2.in.applicationinsights.azure.com/;LiveEndpoint=https://centralus.livediagnostics.monitor.azure.com/;ApplicationId=XXXXXXXX"
```

A full reference of configuration options is available in [the reference documentation](../../reference/descriptors/observability-descriptor.html#_observabilityazuremonitor).

### Google Cloud

Google Cloud is supported for exporting logs, metrics, and traces. The primary piece of configuration it needs is a service account JSON key. The service account associated with the key must have the following IAM roles:

- If exporting metrics to Google Cloud, it must have the `roles/monitoring.metricWriter` role.
- If exporting logs to Google Cloud, it must have the `roles/logging.logWriter` role.

To create such a service account and key using the `gcloud` command, assuming you are logged in and have a Google project configured:

1. Create a service account. In this example, we’ll call it `akka-exporter`.

```
gcloud iam service-accounts create akka-exporter
```
2. Grant the metrics and logging roles, as required, to your service account. Substitute your project ID for `<gcp-project-id>`.

```
gcloud projects add-iam-policy-binding <gcp-project-id> \
    --member "serviceAccount:akka-exporter@<gcp-project-id>.iam.gserviceaccount.com" \
    --role "roles/monitoring.metricWriter"
gcloud projects add-iam-policy-binding <gcp-project-id> \
    --member "serviceAccount:akka-exporter@<gcp-project-id>.iam.gserviceaccount.com" \
    --role "roles/logging.logWriter"
```
3. Generate a key file for your service account, we’ll place it into a file called `key.json`.

```
gcloud iam service-accounts keys create key.json \
    --iam-account akka-exporter@<gcp-project-id>.iam.gserviceaccount.com
```
4. Place the key file in an Akka secret, we’ll call the secret `gcp-credentials`. The key for key file must be `key.json`.

```
akka secret create generic gcp-credentials \
  --from-file key.json=key.json
```

Now that you have configured service account, granted it the necessary roles, created a service account key and placed it into an Akka secret, you can now configure your observability configuration to export to Google Cloud:

Descriptor

```
exporters:
  - googleCloud:
      serviceAccountKeySecret:
        name: gcp-credentials
```

CLI

```
akka project observability add default google-cloud --service-account-key-secret gcp-credentials
```

## Common exporter configuration

### TLS configuration

TLS configuration for multiple different exporters can be configured. To turn off TLS altogether, the `insecure` property can be set to `true`:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        insecure: true
```

CLI

```
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 --insecure
```

To skip verifying server certificates, use insecure skip verify:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        insecureSkipVerify: true
```

CLI

```
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 --insecure-skip-verify
```

To specify a custom CA to verify server certificates, use the server CA property, pointing to an Akka CA secret:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        caSecret:
          name: my-ca
```

CLI

```
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 --server-ca-secret my-ca
```

To specify a client certificate to use to authenticate with a remote server, you can use the client certificate property, pointing to an Akka TLS secret:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        clientCertSecret:
          name: my-client-certificate
```

CLI

```
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 \
  --client-cert-secret my-client-certificate
```

### Custom headers

Custom headers may be configured for a number of exporters. Headers can either have static values, configured directly in the observability configuration, or they can reference secrets.

To specify a static header:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      headers:
        - name: X-My-Header
          value: some-value
```

CLI

```
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 \
  --header X-My-Header=some-value
```

To set a header value from a secret:

Descriptor

```
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      headers:
        - name: X-Token
          valueFrom:
            secretKeyRef:
              name: my-token
              key: token
```

CLI

```
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 \
  --header-secret X-Token=my-token/token
```

## Debugging observability configuration

After updating your observability configuration, you will need to restart a service to use it. This can be done by running the `akka service restart` command. Once the service has been restarted, if there are any issues, you can check the observability agent logs, by running the following command:

```
akka logs <service-name> --instance=false --observability
```

This will show the observability agent logs for all instances of the service. Any errors that the agent encountered will be displayed here.

## See also

- [Observability Descriptor reference](../../reference/descriptors/observability-descriptor.html)
- [`akka project observability` commands](../../reference/cli/akka-cli/akka_projects_observability.html#_see_also)
- [Exported metrics reference](../../reference/telemetry/metrics.html)

## Code Examples

### Example 1: Exporting the observability configuration

```command
akka project observability export
```

### Example 2: Exporting the observability configuration

```yaml
resource: Observability
resourceVersion: v2
spec:
  exporters:
    - kalixConsole: {}
  logs:
    - googleCloud:
        serviceAccountKeySecret:
          name: gcp-credentials
    - kalixConsole: {}
  metrics: []
  traces: []
```

### Example 3: Updating the observability configuration

```command
akka project observability apply -f observability.yaml
```

### Example 4: Editing the observability configuration in place

```command
akka project observability edit
```

### Example 5: Activating tracing (Beta)

```yaml
name: <<service-name>>
service:
  telemetry:
    tracing:
      enabled: true
  image: <<docker-image>>
```

### Example 6: Setting sampling

```yaml
resource: Observability
resourceVersion: v2
spec:
  exporters:
    - kalixConsole: {}
  traces:
    - otlp:
        endpoint: traces.example.com:4317
  traceSampling:
    probabilistic:
      percentage: "2"
```

### Example 7: Updating the configuration using commands

```command
akka project observability get
```

### Example 8: Adding exporters

```command
akka project observability add default otlp --endpoint otlp.example.com:4317
akka project observability add logs google-cloud --service-account-key-secret gcp-credentials
akka project observability add metrics prometheus --endpoint https://prometheus.example.com/api/v1/push
akka project observability add traces otlp --endpoint traces.example.com:4317
```

### Example 9: Removing exporters

```command
akka project observability remove default otlp --endpoint otlp.example.com:4317
akka project observability remove logs google-cloud --service-account-key-secret gcp-credentials
```

### Example 10: Replacing all exporters

```command
akka project observability set default otlp --endpoint otlp.example.com:4317
```

### Example 11: Akka Console

```yaml
exporters:
  - kalixConsole: {}
```

### Example 12: Akka Console

```command
akka project observability add default akka-console
```

### Example 13: OTLP

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4317
```

### Example 14: OTLP

```command
akka project observability add default otlp --endpoint otlp.example.com:4317
```

### Example 15: OTLP HTTP

```yaml
exporters:
  - otlpHttp:
      endpointBaseUrl: https://otlp.example.com:4318
```

### Example 16: OTLP HTTP

```command
akka project observability add default otlp-http --endpoint-base-url https://otlp.example.com:4318
```

### Example 17: OTLP HTTP

```yaml
exporters:
  - otlpHttp:
      endpointBaseUrl: https://otlp.example.com:4318
      encoding: json
```

### Example 18: OTLP HTTP

```command
akka project observability add default otlp-http \
  --endpoint-base-url https://otlp.example.com:4318 \
  --encoding json
```

### Example 19: Prometheus Remote Write

```yaml
metrics:
  - prometheuswrite:
      endpoint: https://prometheus.example.com/api/v1/push
```

### Example 20: Prometheus Remote Write

```command
akka project observability add metrics prometheus --endpoint https://prometheus.example.com/api/v1/push
```

### Example 21: Splunk HEC

```yaml
exporters:
  - splunkHec:
      endpoint: https://<my-trial-instance>.splunkcloud.com:8088/services/collector
      tokenSecret:
        name: my-splunk-token
        key: token
```

### Example 22: Splunk HEC

```command
akka project observability add default splunk-hec \
  --endpoint https://<my-trial-instance>.splunkcloud.com:8088/services/collector \
  --token-secret-name my-splunk-token --token-secret-key token
```

### Example 23: Azure Monitor

```yaml
exporters:
  - azureMonitor:
      connectionString: InstrumentationKey=XXXXXXXX;IngestionEndpoint=https://centralus-2.in.applicationinsights.azure.com/;LiveEndpoint=https://centralus.livediagnostics.monitor.azure.com/;ApplicationId=XXXXXXXX
```

### Example 24: Azure Monitor

```command
akka project observability add default azure-monitor \
  --connection-string "InstrumentationKey=XXXXXXXX;IngestionEndpoint=https://centralus-2.in.applicationinsights.azure.com/;LiveEndpoint=https://centralus.livediagnostics.monitor.azure.com/;ApplicationId=XXXXXXXX"
```

### Example 25: Google Cloud

```shellscript
gcloud iam service-accounts create akka-exporter
```

### Example 26: Google Cloud

```shellscript
gcloud projects add-iam-policy-binding <gcp-project-id> \
    --member "serviceAccount:akka-exporter@<gcp-project-id>.iam.gserviceaccount.com" \
    --role "roles/monitoring.metricWriter"
gcloud projects add-iam-policy-binding <gcp-project-id> \
    --member "serviceAccount:akka-exporter@<gcp-project-id>.iam.gserviceaccount.com" \
    --role "roles/logging.logWriter"
```

### Example 27: Google Cloud

```shellscript
gcloud iam service-accounts keys create key.json \
    --iam-account akka-exporter@<gcp-project-id>.iam.gserviceaccount.com
```

### Example 28: Google Cloud

```shellscript
akka secret create generic gcp-credentials \
  --from-file key.json=key.json
```

### Example 29: Google Cloud

```yaml
exporters:
  - googleCloud:
      serviceAccountKeySecret:
        name: gcp-credentials
```

### Example 30: Google Cloud

```command
akka project observability add default google-cloud --service-account-key-secret gcp-credentials
```

### Example 31: TLS configuration

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        insecure: true
```

### Example 32: TLS configuration

```command
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 --insecure
```

### Example 33: TLS configuration

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        insecureSkipVerify: true
```

### Example 34: TLS configuration

```command
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 --insecure-skip-verify
```

### Example 35: TLS configuration

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        caSecret:
          name: my-ca
```

### Example 36: TLS configuration

```command
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 --server-ca-secret my-ca
```

### Example 37: TLS configuration

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      tls:
        clientCertSecret:
          name: my-client-certificate
```

### Example 38: TLS configuration

```command
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 \
  --client-cert-secret my-client-certificate
```

### Example 39: Custom headers

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      headers:
        - name: X-My-Header
          value: some-value
```

### Example 40: Custom headers

```command
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 \
  --header X-My-Header=some-value
```

### Example 41: Custom headers

```yaml
exporters:
  - otlp:
      endpoint: otlp.example.com:4137
      headers:
        - name: X-Token
          valueFrom:
            secretKeyRef:
              name: my-token
              key: token
```

### Example 42: Custom headers

```command
akka project observability add default otlp \
  --endpoint otlp.example.com:4137 \
  --header-secret X-Token=my-token/token
```

### Example 43: Debugging observability configuration

```command
akka logs <service-name> --instance=false --observability
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/projects/secrets.html
- https://doc.akka.io/operations/services/deploy-service.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability.html
- https://doc.akka.io/reference/descriptors/observability-descriptor.html
- https://doc.akka.io/reference/descriptors/service-descriptor.html
- https://doc.akka.io/reference/telemetry/metrics.html

---
*Source: [https://doc.akka.io/operations/observability-and-monitoring/observability-exports.html](https://doc.akka.io/operations/observability-and-monitoring/observability-exports.html)*