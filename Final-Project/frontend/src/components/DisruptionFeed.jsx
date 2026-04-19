import React from 'react';
import { motion } from 'framer-motion';

const severityBadgeClass = (s) => {
  switch (s?.toUpperCase()) {
    case 'CRITICAL': return 'badge badge-critical';
    case 'HIGH':     return 'badge badge-high';
    case 'LOW':      return 'badge badge-low';
    default:         return 'badge badge-medium';
  }
};

const severityBorderColor = (s) => {
  switch (s?.toUpperCase()) {
    case 'CRITICAL': return 'var(--red)';
    case 'HIGH':     return 'var(--orange)';
    case 'LOW':      return 'var(--green)';
    default:         return 'var(--amber)';
  }
};

const DisruptionFeed = ({ cases, onSelectCase, activeCaseId }) => {
  if (cases.length === 0) {
    return (
      <div style={{
        height: 120, display: 'flex', flexDirection: 'column',
        alignItems: 'center', justifyContent: 'center', gap: 10,
        color: 'var(--text-3)',
      }}>
        <div style={{
          width: 24, height: 24, borderRadius: '50%',
          border: '1.5px solid var(--border-2)',
          animation: 'spin 3s linear infinite',
        }} />
        <span style={{ fontSize: 11, color: 'var(--text-3)' }}>Waiting for incidents</span>
      </div>
    );
  }

  return (
    <div style={{ display: 'flex', flexDirection: 'column', gap: 2 }}>
      {cases.map((c, i) => {
        const isActive = activeCaseId === c.caseId;
        const severity = c.extractedEvent?.severity || c.severity || 'MEDIUM';
        const borderColor = severityBorderColor(severity);

        return (
          <motion.div
            key={c.caseId}
            initial={{ opacity: 0, y: -4 }}
            animate={{ opacity: 1, y: 0 }}
            transition={{ delay: Math.min(i * 0.04, 0.3) }}
            onClick={() => onSelectCase(c)}
            style={{
              display: 'flex', gap: 10,
              padding: '9px 10px 9px 12px',
              borderRadius: 'var(--r)',
              cursor: 'pointer',
              background: isActive ? 'var(--surface-2)' : 'transparent',
              border: `1px solid ${isActive ? 'var(--border-2)' : 'transparent'}`,
              transition: 'background 0.12s, border-color 0.12s',
              position: 'relative',
            }}
            onMouseEnter={e => { if (!isActive) e.currentTarget.style.background = 'var(--surface)'; }}
            onMouseLeave={e => { if (!isActive) e.currentTarget.style.background = 'transparent'; }}
          >
            {/* Severity bar */}
            <div style={{
              width: 2, borderRadius: 2, flexShrink: 0, alignSelf: 'stretch',
              background: borderColor, opacity: isActive ? 1 : 0.5,
            }} />

            <div style={{ flex: 1, minWidth: 0 }}>
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: 4 }}>
                <span className={severityBadgeClass(severity)}>{severity}</span>
                <span className="mono" style={{ fontSize: 10, color: 'var(--text-3)' }}>
                  {new Date(c.createdAt).toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' })}
                </span>
              </div>

              <p style={{
                fontSize: 12, color: isActive ? 'var(--text-1)' : 'var(--text-2)',
                lineHeight: 1.4, marginBottom: 4,
                overflow: 'hidden', display: '-webkit-box',
                WebkitLineClamp: 2, WebkitBoxOrient: 'vertical',
              }}>
                {c.rawInput}
              </p>

              <div style={{ display: 'flex', alignItems: 'center', gap: 6 }}>
                <span className="mono" style={{ fontSize: 10, color: 'var(--text-3)' }}>
                  {c.extractedEvent?.eventType || '—'}
                </span>
                {c.extractedEvent?.entityId && (
                  <>
                    <span style={{ color: 'var(--border-2)', fontSize: 10 }}>·</span>
                    <span className="mono" style={{ fontSize: 10, color: 'var(--text-3)' }}>
                      {c.extractedEvent.entityId}
                    </span>
                  </>
                )}
              </div>
            </div>
          </motion.div>
        );
      })}
    </div>
  );
};

export default DisruptionFeed;
