/* eslint-disable no-unused-vars */
import React from 'react';
import { NavLink } from 'react-router-dom';

const HeaderComponent = () => {
  return (
    <div>
      <header>
        <nav className="navbar-expand-lg navbar navbar-dark bg-primary">
          <a className="navbar-brand" href="https://www.kfpricefs.net">
            Employee Management System
          </a>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav">
              <li className="nav-item">
                <NavLink className="nav-link" to="/employees">
                  Employees
                </NavLink>
              </li>

              <li className="nav-item">
                <NavLink className="nav-link" to="/departments">
                  Departments
                </NavLink>
              </li>
            </ul>
          </div>
        </nav>
      </header>
    </div>
  );
};

export default HeaderComponent;
