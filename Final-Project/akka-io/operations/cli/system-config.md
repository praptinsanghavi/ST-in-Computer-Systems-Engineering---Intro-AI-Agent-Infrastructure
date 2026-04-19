---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:13Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/cli/system-config.html
title: 'System Configuration :: Akka Documentation'
---

# System Configuration :: Akka Documentation

## Content

# System Configuration

The Akka CLI supports system\-level configuration that allows administrators to customize CLI behavior across all users on a machine. This is useful for enterprise deployments where you want to control default settings, specify internal mirrors for templates, or disable certain features.

## Configuration Options

The following settings can be configured at the system level:

| Setting | Description | Default |
| --- | --- | --- |
| `code-templates-url` | URL of project templates used by `akka code init` | `https://doc.akka.io/_attachments/akka-code-init.json` |
| `context-url` | URL of documentation context used by AI coding assistants | `https://doc.akka.io/java/_attachments/akka-docs-md.zip` |
| `context-subdir` | Subdirectory name where context files are stored | `akka-context` |

To disable a feature, set its value to `none`. For example, setting `context-url` to `none` disables automatic context downloading.

## Configuration File Locations

The CLI looks for system configuration in platform\-specific locations:

Linux

```
/etc/akka/config.yml
```

macOS

The CLI checks for configuration in this order:

1. MDM\-managed plist (preferred for enterprise deployments):

```
/Library/Managed Preferences/io.akka.cli.plist
```
2. YAML configuration file:

```
/Library/Application Support/akka/config.yml
```

If an MDM plist is present, the YAML file is ignored.

Windows

```
%ProgramData%\akka\config.yml
```

Typically this resolves to `C:\ProgramData\akka\config.yml`.

## YAML Configuration Format

Create a YAML file at the appropriate location for your platform:

```
code-templates-url: https://internal.example.com/akka-templates.json
context-url: https://internal.example.com/akka-context.zip
context-subdir: akka-context
```

To disable context downloading:

```
context-url: none
```

Any settings not specified in the configuration file will use their default values.

## macOS MDM Configuration

For macOS devices managed via Mobile Device Management (MDM), you can deploy configuration using a property list (plist) file. This is the recommended approach for enterprise macOS deployments.

Create a configuration profile with the bundle identifier `io.akka.cli` containing the following keys:

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
    <key>code-templates-url</key>
    <string>https://internal.example.com/akka-templates.json</string>
    <key>context-url</key>
    <string>https://internal.example.com/akka-context.zip</string>
    <key>context-subdir</key>
    <string>akka-context</string>
</dict>
</plist>
```

Deploy this as a managed preference using your MDM solution.

## Precedence

Configuration is resolved in the following order (first match wins):

1. macOS MDM plist (macOS only)
2. System YAML configuration file
3. Built\-in defaults

## Troubleshooting

If the YAML configuration file exists but contains invalid syntax, the CLI will print a warning to standard error and fall back to default values:

```
Warning: failed to parse /etc/akka/config.yml: yaml: unmarshal errors: ...
```

Verify your YAML syntax is correct if you see this warning.

## Related documentation

- [Install the Akka CLI](installation.html)
- [Using the Akka CLI](using-cli.html)

## Code Examples

### Example 1: Configuration File Locations

```none
/etc/akka/config.yml
```

### Example 2: Configuration File Locations

```none
/Library/Managed Preferences/io.akka.cli.plist
```

### Example 3: Configuration File Locations

```none
/Library/Application Support/akka/config.yml
```

### Example 4: Configuration File Locations

```none
%ProgramData%\akka\config.yml
```

### Example 5: YAML Configuration Format

```yaml
code-templates-url: https://internal.example.com/akka-templates.json
context-url: https://internal.example.com/akka-context.zip
context-subdir: akka-context
```

### Example 6: YAML Configuration Format

```yaml
context-url: none
```

### Example 7: macOS MDM Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
    <key>code-templates-url</key>
    <string>https://internal.example.com/akka-templates.json</string>
    <key>context-url</key>
    <string>https://internal.example.com/akka-context.zip</string>
    <key>context-subdir</key>
    <string>akka-context</string>
</dict>
</plist>
```

### Example 8: Troubleshooting

```none
Warning: failed to parse /etc/akka/config.yml: yaml: unmarshal errors: ...
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/operations/cli/using-cli.html

---
*Source: [https://doc.akka.io/operations/cli/system-config.html](https://doc.akka.io/operations/cli/system-config.html)*