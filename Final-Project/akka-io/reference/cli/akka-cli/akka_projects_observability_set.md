---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:24Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set.html
title: 'akka projects observability set :: Akka Documentation'
---

# akka projects observability set :: Akka Documentation

## Content

# akka projects observability set

Set the observability settings for your Akka project.

## Synopsis

The `akka project observability set` command sets the observability settings for your Akka project.

## Options

```
  -h, --help   help for set
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
- [akka projects observability set default](akka_projects_observability_set_default.html) \- Set the default exporter for your Akka project.
- [akka projects observability set logs](akka_projects_observability_set_logs.html) \- Set the logs exporter for your Akka project.
- [akka projects observability set metrics](akka_projects_observability_set_metrics.html) \- Set the metrics exporter for your Akka project.
- [akka projects observability set traces](akka_projects_observability_set_traces.html) \- Set the traces exporter for your Akka project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set_default.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set_logs.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set_metrics.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set_traces.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_set.html)*