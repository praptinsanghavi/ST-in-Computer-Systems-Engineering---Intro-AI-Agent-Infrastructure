---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:16Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove.html
title: 'akka projects observability remove :: Akka Documentation'
---

# akka projects observability remove :: Akka Documentation

## Content

# akka projects observability remove

Remove an exporter from the observability settings for your Akka project.

## Synopsis

The `akka project observability remove` command removes an exporter from the observability settings for your Akka project.
Exporters are matched by their endpoint.

## Options

```
  -h, --help   help for remove
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

- [akka projects observability](akka_projects_observability.html) \- Manage the observability settings for your Akka project.
- [akka projects observability remove default](akka_projects_observability_remove_default.html) \- Remove a default exporter from your Akka project.
- [akka projects observability remove logs](akka_projects_observability_remove_logs.html) \- Remove a logs exporter from your Akka project.
- [akka projects observability remove metrics](akka_projects_observability_remove_metrics.html) \- Remove a metrics exporter from your Akka project.
- [akka projects observability remove traces](akka_projects_observability_remove_traces.html) \- Remove a traces exporter from your Akka project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_default.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_logs.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_metrics.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove_traces.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_remove.html)*