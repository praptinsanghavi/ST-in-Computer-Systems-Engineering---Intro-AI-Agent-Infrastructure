-- ============================================================
-- Akka Persistence JDBC 5.x — Journal + Snapshot tables
-- Standard schema for PostgreSQL
-- ============================================================

CREATE TABLE IF NOT EXISTS event_journal(
  ordering BIGSERIAL,
  persistence_id VARCHAR(255) NOT NULL,
  sequence_number BIGINT NOT NULL,
  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  write_timestamp BIGINT NOT NULL,
  adapter_manifest VARCHAR(255) NOT NULL,
  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,
  PRIMARY KEY(persistence_id, sequence_number)
);

CREATE UNIQUE INDEX event_journal_ordering_idx ON event_journal(ordering);

CREATE TABLE IF NOT EXISTS event_tag(
    event_id BIGINT NOT NULL,
    tag VARCHAR(256) NOT NULL,
    PRIMARY KEY(event_id, tag),
    CONSTRAINT fk_event_journal
      FOREIGN KEY(event_id)
      REFERENCES event_journal(ordering)
      ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS snapshot (
  persistence_id VARCHAR(255) NOT NULL,
  sequence_number BIGINT NOT NULL,
  created BIGINT NOT NULL,
  snapshot_ser_id INTEGER NOT NULL,
  snapshot_ser_manifest VARCHAR(255) NOT NULL,
  snapshot_payload BYTEA NOT NULL,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,
  PRIMARY KEY (persistence_id, sequence_number)
);

-- Read-side projection: disruption reports audit log
CREATE TABLE IF NOT EXISTS disruption_reports (
  case_id           VARCHAR(64)   PRIMARY KEY,
  raw_input         TEXT          NOT NULL,
  event_type        VARCHAR(64),
  entity_id         VARCHAR(64),
  severity          VARCHAR(32),
  duration_hours    INT,
  confidence        NUMERIC(5,2),
  impact_summary    JSONB,
  mitigations       JSONB,
  status            VARCHAR(32)   NOT NULL DEFAULT 'PENDING',
  created_at        TIMESTAMPTZ   NOT NULL DEFAULT NOW(),
  completed_at      TIMESTAMPTZ
);

CREATE INDEX IF NOT EXISTS idx_reports_status    ON disruption_reports(status);
CREATE INDEX IF NOT EXISTS idx_reports_entity    ON disruption_reports(entity_id);
CREATE INDEX IF NOT EXISTS idx_reports_created   ON disruption_reports(created_at DESC);
