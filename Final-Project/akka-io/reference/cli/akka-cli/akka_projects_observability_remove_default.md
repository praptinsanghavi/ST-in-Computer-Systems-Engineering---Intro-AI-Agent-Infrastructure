---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:16Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default.html
title: 'akka projects observability remove default :: Akka Documentation'
---

# akka projects observability remove default :: Akka Documentation

## Content

# akka projects observability remove default

Remove a default exporter from your Akka project.

## Synopsis

The `akka project observability remove default` command removes a default exporter from your Akka project.

## Options

```
  -h, --help   help for default
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka projects observability remove](akka_projects_observability_remove.html) \- Remove an exporter from the observability settings for your Akka project.
- [akka projects observability remove default azure\-monitor](akka_projects_observability_remove_default_azure-monitor.html) \- Remove an Azure Monitor exporter from default by connection string.
- [akka projects observability remove default google\-cloud](akka_projects_observability_remove_default_google-cloud.html) \- Remove a Google Cloud exporter from default by service account secret.
- [akka projects observability remove default otlp](akka_projects_observability_remove_default_otlp.html) \- Remove an OTLP gRPC exporter from default by endpoint.
- [akka projects observability remove default otlp\-http](akka_projects_observability_remove_default_otlp-http.html) \- Remove an OTLP HTTP exporter from default by endpoint.
- [akka projects observability remove default splunk\-hec](akka_projects_observability_remove_default_splunk-hec.html) \- Remove a Splunk HEC exporter from default by endpoint.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default_azure-monitor.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default_google-cloud.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default_otlp-http.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default_otlp.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default_splunk-hec.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default.html)*