---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:35Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_settings.html
title: 'akka projects settings :: Akka Documentation'
---

# akka projects settings :: Akka Documentation

## Content

# akka projects settings

Configures the settings on a project.

## Synopsis

The `akka project settings` commands provides a way to configure the settings of a project

## Options

```
  -h, --help   help for settings
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

- [akka projects](akka_projects.html) \- Manage your Akka projects.
- [akka projects settings bring\-up\-region](akka_projects_settings_bring-up-region.html) \- Brings up a region that was previously downed without need for redeployment.
- [akka projects settings down\-region](akka_projects_settings_down-region.html) \- Downs a region without need for redeployment.
Optionally select a new region as a primary.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_settings_bring-up-region.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_settings_down-region.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_settings.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_settings.html)*