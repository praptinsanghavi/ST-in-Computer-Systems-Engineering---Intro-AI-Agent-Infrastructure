---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:40Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_specify_init.html
title: 'akka specify init :: Akka Documentation'
---

# akka specify init :: Akka Documentation

## Content

# akka specify init

Initialize a new Akka project for AI\-assisted development.

## Synopsis

Initialize a project with everything needed for AI\-assisted Akka development.
This command:

1. Clones an Akka sample project (or uses the current directory with '.')
2. Downloads the Akka SDK constitution (and additional constitution, if configured)
3. Installs slash commands and templates
4. Configures the MCP server for AI agent integration

The cloned repository includes CLAUDE.md, AGENTS.md, and Akka AI context files that are version\-synchronized with the SDK.

|  | Building the project requires the Akka resolver in your Maven settings.xml. If not yet configured, this command will guide you through setup before initializing the project. |
| --- | --- |

After running this command, open Claude Code (or your preferred AI agent) in the project directory to start developing.

Examples: akka specify init my\-service \# clone sample into new directory cd my\-service \&\& claude

akka specify init . \# install resources in current directory claude

```
akka specify init [directory] [flags]
```

## Options

```
      --agent string    AI agent to configure (claude-code, cursor, vscode-copilot, generic). (default "claude-code")
  -h, --help            help for init
      --skip-commands   Skip slash-command installation (use when commands are provided by a plugin).
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

- [akka specify](akka_specify.html) \- Initialize and manage AI\-assisted Akka development projects.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_specify.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_specify_init.html](https://doc.akka.io/reference/cli/akka-cli/akka_specify_init.html)*