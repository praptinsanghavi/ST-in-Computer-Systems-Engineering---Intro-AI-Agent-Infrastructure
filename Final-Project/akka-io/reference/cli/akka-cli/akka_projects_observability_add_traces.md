---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:12Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces.html
title: 'akka projects observability add traces :: Akka Documentation'
---

# akka projects observability add traces :: Akka Documentation

## Content

# akka projects observability add traces

Add a traces exporter for your Akka project.

## Synopsis

The `akka project observability add traces` command adds a traces exporter for your Akka project.

## Options

```
  -h, --help   help for traces
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

- [akka projects observability add](akka_projects_observability_add.html) \- Add an exporter to the observability settings for your Akka project.
- [akka projects observability add traces azure\-monitor](akka_projects_observability_add_traces_azure-monitor.html) \- Add an Azure Monitor exporter for traces.
- [akka projects observability add traces google\-cloud](akka_projects_observability_add_traces_google-cloud.html) \- Add a Google Cloud exporter for traces.
- [akka projects observability add traces otlp](akka_projects_observability_add_traces_otlp.html) \- Add an OTLP gRPC exporter for traces.
- [akka projects observability add traces otlp\-http](akka_projects_observability_add_traces_otlp-http.html) \- Add an OTLP HTTP exporter for traces.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces_azure-monitor.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces_google-cloud.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces_otlp-http.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces_otlp.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_add_traces.html)*