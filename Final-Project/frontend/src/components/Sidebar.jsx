/**
 * SIDEBAR COMPONENT
 * ============================================================================
 * ROLE: Navigation & Brand Identity
 *
 * Provides global navigation and brand anchoring for the Command Center.
 * Implements the Glassmorphism theme as part of the core design system.
 * ============================================================================
 */
import React from 'react';
import { LayoutDashboard, Network, AlertTriangle, Settings, History } from 'lucide-react';

const Sidebar = () => {
  return (
    <aside className="sidebar h-full w-20 flex flex-col items-center py-8 glass-card border-r border-[var(--surface-border)]">
      <div className="logo-container mb-12">
        <div className="w-10 h-10 rounded-lg bg-gradient-to-br from-[var(--primary)] to-[var(--secondary)] flex items-center justify-center glow-primary">
          <Network size={24} color="white" />
        </div>
      </div>
      
      <nav className="flex-1 flex flex-col gap-8">
        <NavItem icon={<LayoutDashboard size={24} />} active />
        <NavItem icon={<History size={24} />} />
        <NavItem icon={<AlertTriangle size={24} />} />
        <NavItem icon={<Settings size={24} />} />
      </nav>
      
      <div className="user-avatar w-10 h-10 rounded-full border-2 border-[var(--primary)] overflow-hidden">
        <img src="https://api.dicebear.com/7.x/avataaars/svg?seed=Felix" alt="User" />
      </div>
    </aside>
  );
};

const NavItem = ({ icon, active }) => (
  <button className={`p-3 rounded-xl transition-all duration-300 ${active ? 'bg-[var(--primary)] text-black glow-primary' : 'text-[var(--text-secondary)] hover:text-[var(--text-primary)] hover:bg-[var(--surface-border)]'}`}>
    {icon}
  </button>
);

export default Sidebar;
